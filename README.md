# TIY-Theramin

THE HURLITZER  
The Hurlitzer is a touch-based musical keyboard.  When you slide your finger along the 
touch capacitor, it generates a note depending on the position of your finger.  When you
don't touch it, the Hurltizer automatically generates pleasing, randomized tones for your
listening enjoyment.  We accomplished this project by using the BeagleBone Black, a piezo
speaker, a SoftPot potentiometer, some Java code and a whole lot of wires.  
Assembly:
    Parts:
75mm male-to-male jumper wires (x3)
75mm male-to-female jumper wires (x5)
11.90 mm diameter Piezo speaker (x1)
100mm Linear SoftPot (Ribbon Sensor) (x1)
Half-size breadboard (x1)
BeagleBoard Black (x1)
microUSB-to-USB cable (x1)
Edimax EW‑7811Un Network Adapter (x1)
5V power adaptor (x1)
10k Ω resistor (x1)
    Steps:
A: Piezo Speaker
1. Connect the female end of one MtF jumper wire to the positive terminal of the piezo 
speaker, and connect the male end to the A1N1 pinout (P9-39) on the BeagleBone Black. 
2. Connect the female end of one MtF jumper wire to the negative terminal of the piezo
speaker, and connect the male end to the P9-2 pinout.  
B: SoftPot
1. Use a MtF jumper to connect the middle input pin of the SoftPot to one of the middle rows
of the breadboard.  
2. Place one pin of the 10k resistor adjacent to the SoftPot connection, 
and place one end of a MtM jumper adjacent to the other pin of the resistor (both pins of
the resistor should now be inserted into the breadboard). 
3. Insert the other end of the MtM jumper into (A1N1) P9-40 on the BeagleBone. 
4. Repeat the same process for the power pin on the SoftPot.  Use jumper cables to connect 
the power pin to the negative track on the breadboard, and then connect the negative track
to the P9-34 pinout on the BBB.  
5. Do the same for the positive pin on the SoftPot, ending with the P9-32 pinout on the 
BBB.
Setup:
1. First, use git in your command line to clone the project.  Assuming you have git
installed, type the following: 
git clone git@github.com:danedexF5/TIY-Theramin.git
Next, open the folder you just cloned (TIY-Theramin) in IntelliJ.
Plug in your BBB via USB (to your mac) and 5V power adaptor. 
Install Java on your BBB by following these instructions: 
http://elinux.org/Beagleboard:BeagleBoneBlack_Debian#Oracle_Java_8
Install the Serial drivers for your BBB from the start.html file located in the BBB drive 
that mounts when you plug in the BBB via USB.  Install these drivers as well:
https://tiy-learn-content.s3.amazonaws.com/b235f72f-HoRNDIS-rel8pre1.pkg
Connect to the BBB by entering this command in your command line:
ssh 192.168.7.2 -l root
If this doesn't work, check network settings and insert the proper IP address for the BBB.
Now that you're connected to the BBB, type 
cd Projects
followed by 
cd Theramin
Type chmod -a+x run.sh to allow the run script to run. 
type ./run.sh, and you should hear beeps coming from the speaker.  Touch your finger to 
the SoftPot and slide it to change the note.  Press ctrl-C to stop the program.  
Have fun!
Fritzing link:
http://imgur.com/RoLgAwR
Video link:
https://www.youtube.com/watch?v=rvRoH4t9kjU
