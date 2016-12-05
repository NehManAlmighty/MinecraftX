# MinecraftX
Adds lots and lots of new features to Minecraft!
## About
This is my first Minecraft Forge mod and it's never fully complete. I plan to update it often so that when my mod becomes popular, it stays popular :) I never coded a mod before, only Bukkit/Spigot plugins xD. Compared to BoS (Bukkit or Spigot), Forge's API is a lot harder, and that is why you are allowed to contribute on my project (Planning for a reward system for contributers on GitHub).
## How to contribute
This project is written in Java (duh, it's a MC mod bruh), and is based on the Git version-control-system. For those who don't know, GitHub provides free hosting for Git (ok, it's just my interpretation of things), and supports pushing, pulling, and committing code (Like all Git hosting). I also made the code SUPER easy to understand to help Java newbies to contribute. For example, all the packages are properly named, classes and so. And before you contribute, I recommend to read _Bedrock_Miner_'s tutorial on forge modding. You don't necessarily need to create your own mod. Just read the tutorial so that you get a basic understanding of how my mod works. For novices and experts at Java, the Main class is located in the package com.nehman.forge.minecraftx (SEE, PACKAGE NAMES ARE SIMPLE).
## How to build
You firstly need to install Gradle and download the Forge MDK version 12.18.2.2179 or later. You can download version 12.18.2.2179 from the following download link: http://files.minecraftforge.net/maven/net/minecraftforge/forge/1.10.2-12.18.2.2179/forge-1.10.2-12.18.2.2179-mdk.zip. Once you have the Forge MDK, extract it to a folder named "Forge" and continue with the next steps.
### For Windows
**BEFORE YOU CONTINUE PLEASE SET THE JAVA_HOME ENVIRONMENT VARIABLE**

Open a command prompt at the Forge folder you created earlier and type in:

###### gradlew.bat setupDecompWorkspace

And after that type in:

###### gradlew.bat eclipse

Then download the source code for my mod and extract it to a folder named MinecraftX. Move the folder so that it is next to the Forge folder (NOT INSIDE IT!!). Then put both folders inside another folder named workspace. Open up Eclipse and set it's workspace to the 'workspace' folder we created. Then click File > Import and choose the root directory as the MinecraftX folder. Repeat the step for the Forge folder too. Now you should see 2 projects in your eclipse workspace (Forge and MinecraftX). Don't worry if there are errors now. Right-Click MinecraftX and click Build Path > Configure Build Path. Click the Build Paths TAB and add the Forge project to it. Now minimize eclipse and go to the MinecraftX folder again. Delete the file named '.classpath'. Now go to the forge folder and copy the '.classpath' file to the eclipse folder. Now all the Referenced Libraries errors should be fixed. Now edit the code at will, and just build the mod by:

Going to the MinecraftX folder again. Open a command prompt there. Type in 'gradle build' and wait for the process to complete. Once finished, the compiled JAR file can be found in bin\libs folder as well as the sources JAR file.

## Some useful text
### To change the version of the mod
In the build.gradle file, edit the line that says:
###### version = "LOL_ANY_RANDOM_VERSION_NUMBER_HERE"
And then rebuild the mod by running "gradle build" while on the root directory of the mod's sources.
