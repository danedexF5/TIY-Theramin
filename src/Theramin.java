import org.bulldog.beagleboneblack.BBBNames;
import org.bulldog.core.Signal;
import org.bulldog.core.gpio.AnalogInput;
import org.bulldog.core.gpio.DigitalOutput;
import org.bulldog.core.gpio.Pwm;
import org.bulldog.core.platform.Board;
import org.bulldog.core.platform.Platform;
import org.bulldog.devices.led.Led;

import java.util.Scanner;

/**
 * This makes the wiggly sounds
 */

public class Theramin {

    public static void main(String[] args) throws InterruptedException {

        Board board = Platform.createBoard();

        /*
        Important pins:
        AIN1 = P9 40 (analog input 1) for flex
        P9 34 = ground (-) for flex
        P9 32 = power (+) for flex

        GPIO_14 = P8 12 (digital input) for speaker
        P8 02 = ground (-) for speaker
         */

        // Get an analogInput
        // AIN1 = P9 40 (analog input 1)
        // The light sensor is grounded to P9 34.
        // This is the flex sensor
        AnalogInput analogInput = board.getPin(BBBNames.AIN1).as(AnalogInput.class);

        // Get a pulse width modulated (PWN) pin.
        // PWM_P8_12 = P8 12

        DigitalOutput speaker = board.getPin(BBBNames.P8_12).as(DigitalOutput.class);

        Pwm beeper = board.getPin(BBBNames.EHRPWM2A_P8_19).as(Pwm.class);

        //main loop

        while (true) {

            double flex = analogInput.read();

            System.out.println(flex);

            /*

            speaker.write(Signal.High);

            Thread.sleep((long)flex);

            speaker.write(Signal.Low);

            Thread.sleep((long)flex);

            */

            beeper.setFrequency(3400f);

            beeper.setDuty(0.5f);

            beeper.enable();

        }


    }

}

