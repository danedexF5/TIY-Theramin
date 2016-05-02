# TIY-Theramin

# THE HURLITZER
<br />
The Hurlitzer is a touch-based musical keyboard.  When you slide your finger along the 
touch capacitor, it generates a note depending on the position of your finger.  When you
don't touch it, the Hurltizer automatically generates pleasing, randomized tones for your
listening enjoyment.  We accomplished this project by using the BeagleBone Black, a piezo
speaker, a SoftPot potentiometer, some Java code and a whole lot of wires.  
<br />
## Assembly
<br />
#### Parts:
<br />
-75mm male-to-male jumper wires (x3)
<br />
-75mm male-to-female jumper wires (x5)
<br />
-11.90 mm diameter Piezo speaker (x1)
<br />
-100mm Linear SoftPot (Ribbon Sensor) (x1)
<br />
-Half-size breadboard (x1)
<br />
-BeagleBoard Black (x1)
<br />
-microUSB-to-USB cable (x1)
<br />
-Edimax EW‑7811Un Network Adapter (x1)
<br />
-5V power adaptor (x1)
<br />
-10k Ω resistor (x1)
<br />
<br />
##Steps
<br />
**A**: Piezo Speaker
<br />
1. Connect the female end of one MtF jumper wire to the positive terminal of the piezo 
speaker, and connect the male end to the A1N1 pinout (P9-39) on the BeagleBone Black. 
<br />
2. Connect the female end of one MtF jumper wire to the negative terminal of the piezo
speaker, and connect the male end to the P9-2 pinout. 
<br />
**B**: SoftPot
<br />
1. Use a MtF jumper to connect the middle input pin of the SoftPot to one of the middle rows
of the breadboard.
<br />
2. Place one pin of the 10k resistor adjacent to the SoftPot connection, 
and place one end of a MtM jumper adjacent to the other pin of the resistor (both pins of
the resistor should now be inserted into the breadboard).
<br />
3. Insert the other end of the MtM jumper into (A1N1) P9-40 on the BeagleBone.<br /> 
4. Repeat the same process for the power pin on the SoftPot.  Use jumper cables to connect 
the power pin to the negative track on the breadboard, and then connect the negative track
to the P9-34 pinout on the BBB.
<br />
5. Do the same for the positive pin on the SoftPot, ending with the P9-32 pinout on the 
BBB.
<br />
<br />
##Setup
<br />
1. First, use git in your command line to clone the project.  Assuming you have git
installed, type the following: 
git clone git@github.com:danedexF5/TIY-Theramin.git 
<br />
2. Next, open the folder you just cloned (TIY-Theramin) in IntelliJ.
<br />
3. Plug in your BBB via USB (to your mac) and 5V power adaptor. 
<br />
<br />
##Install Java on your BBB by following these instructions: 
<br />
1.http://elinux.org/Beagleboard:BeagleBoneBlack_Debian#Oracle_Java_8
<br />
2. Install the Serial drivers for your BBB from the start.html file located in the BBB drive 
that mounts when you plug in the BBB via USB.
<br />
**Install these drivers as well**:
**https://tiy-learn-content.s3.amazonaws.com/b235f72f-HoRNDIS-rel8pre1.pkg**
<br />
3. Connect to the BBB by entering this command in your command line:
ssh 192.168.7.2 -l root
<br />
(If this doesn't work, check network settings and insert the proper IP address for the BBB.)
<br />
4. Now that you're connected to the BBB, type:
<br />
-**cd Projects**
<br />
-followed by **cd Theramin**
<br />
5. Next, type **chmod -a+x run.sh** to allow the run script to run. 
<br />
6. Type **./run.sh**, and you should hear beeps coming from the speaker.  Touch your finger to 
the SoftPot and slide it to change the note.  
7. Press **ctrl-C** to stop the program.
<br />
8. Have fun!
<br />
<br />
![Imgur](http://i.imgur.com/KsvmRiz.jpg)
<br />
<br />
Video link:
https://www.youtube.com/watch?v=rvRoH4t9kjU
