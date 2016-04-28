import org.bulldog.beagleboneblack.BBBNames;
import org.bulldog.core.gpio.AnalogInput;
import org.bulldog.core.gpio.Pwm;
import org.bulldog.core.platform.Board;
import org.bulldog.core.platform.Platform;

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
        //Pwm digital = board.getPin(BBBNames.P8_12).as(Pwm.class);

        //Scanner

        Scanner quit = new Scanner(System.in);

        //main loop

        while (true) {

            double flex = analogInput.read();

            Thread.sleep(100);

            System.out.println(flex);



            //digital.setFrequency(1);

        }


    }

}
// TODO: 4/27/16  make flex sensor output something
// TODO: 4/27/16  make piezo speaker make a noise 

// TODO: 4/27/16  make speaker respond to flex sensor