import org.bulldog.beagleboneblack.BBBNames;
import org.bulldog.core.gpio.AnalogInput;
import org.bulldog.core.gpio.Pwm;
import org.bulldog.core.platform.Board;
import org.bulldog.core.platform.Platform;

/**
 * This makes the wiggly sounds
 */

public class Theramin {

    public static void main(String[] args) throws InterruptedException {

        Board board = Platform.createBoard();

        //touch sensor

        AnalogInput analogInput = board.getPin(BBBNames.AIN1).as(AnalogInput.class);

        //speaker

        Pwm beeper = board.getPin(BBBNames.EHRPWM2A_P8_19).as(Pwm.class);

        /*


         */

        //main loop

        while (true) {

            double touch = (analogInput.read()) * 10;
            int note = (int)touch;

            System.out.println(note);

            Thread.sleep(200);

                switch (note) {
                    //c4
                    case 0:
                        beeper.setFrequency(261.63);
                        break;
                    //d4
                    case 1:
                        beeper.setFrequency(293.66);
                        break;
                    //e4
                    case 2:
                        beeper.setFrequency(329.63);
                        break;
                    //f4
                    case 3:
                        beeper.setFrequency(349.23);
                        break;
                    //g4
                    case 4:
                        beeper.setFrequency(392);
                        break;
                    //a4
                    case 5:
                        beeper.setFrequency(440);
                        break;
                    //b4
                    case 6:
                        beeper.setFrequency(493.88);
                        break;
                    //c5
                    case 7:
                        beeper.setFrequency(523.25);
                        break;
                    //d5
                    case 8:
                        beeper.setFrequency(587.33);
                        break;
                    //e5
                    case 9:
                        beeper.setFrequency(659.25);
                        break;
                    //f5
                    case 10:
                        beeper.setFrequency(698.46);
                        break;

                    default:
                        break;

            }

            //beeper.setFrequency(touch);

            beeper.setDuty(0.5f);

            beeper.enable();


        }


    }

}

//todo define and implement notes
//todo add second speaker + accelerometer