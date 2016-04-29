import org.bulldog.beagleboneblack.BBBNames;
import org.bulldog.core.gpio.AnalogInput;
import org.bulldog.core.gpio.Pwm;
import org.bulldog.core.platform.Board;
import org.bulldog.core.platform.Platform;

import java.util.Arrays;

/**
 * This makes the wiggly sounds
 */

public class Theramin {

    public static void main(String[] args) throws InterruptedException {

        Board board = Platform.createBoard();

        //touch sensor

        AnalogInput analogInput = board.getPin(BBBNames.AIN1).as(AnalogInput.class);

        //speakers

        Pwm beeper = board.getPin(BBBNames.EHRPWM2B_P8_13).as(Pwm.class);
        Pwm beeper5th = board.getPin(BBBNames.EHRPWM0B_P9_22).as(Pwm.class);

        //main loop

        while (true) {

                //beeper5th.setFrequency(1000);

            double touch = (analogInput.read()) * 10;
                int note = (int)touch;

                System.out.println(note);

                Thread.sleep(200);

                //notes
                switch (note) {
                    //c4
                    case 0:
                        beeper.setFrequency(261.63);
                        beeper5th.setFrequency(261.63 * 1.5);
                        System.out.println("C4");
                        break;
                    //d4
                    case 1:
                        beeper.setFrequency(293.66);
                        beeper5th.setFrequency(293.66 * 1.5);
                        System.out.println("D4");
                        break;
                    //e4
                    case 2:
                        beeper.setFrequency(329.63);
                        beeper5th.setFrequency(329.63 * 1.5);
                        System.out.println("E4");
                        break;
                    //f4
                    case 3:
                        beeper.setFrequency(349.23);
                        beeper5th.setFrequency(349.23 * 1.5);
                        System.out.println("F4");
                        break;
                    //g4
                    case 4:
                        beeper.setFrequency(392);
                        beeper5th.setFrequency(392 * 1.5);
                        System.out.println("G4");
                        break;
                    //a4
                    case 5:
                        beeper.setFrequency(440);
                        beeper5th.setFrequency(440 * 1.5);
                        System.out.println("A4");
                        break;
                    //b4
                    case 6:
                        beeper.setFrequency(493.88);
                        beeper5th.setFrequency(493.88 * 1.5);
                        System.out.println("B4");
                        break;
                    //c5
                    case 7:
                        beeper.setFrequency(523.25);
                        beeper5th.setFrequency(523.25 * 1.5);
                        System.out.println("C5");
                        break;
                    //d5
                    case 8:
                        beeper.setFrequency(587.33);
                        beeper5th.setFrequency(587.33 * 1.5);
                        System.out.println("D5");
                        break;
                    //e5
                    case 9:
                        beeper.setFrequency(659.25);
                        beeper5th.setFrequency(659.25 * 1.5);
                        System.out.println("E5");
                        break;
                    //f5
                    case 10:
                        beeper.setFrequency(698.46);
                        beeper5th.setFrequency(698.46 * 1.5);
                        System.out.println("F5");
                        break;

                    default:
                        break;


            }

            beeper.setDuty(0.5f);

            beeper.enable();


        }


    }

}
