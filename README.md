# csb-uniqueid
Java code example to generate a Unique ID for the CSB (Crowdsourced Bathymetry) project.

The main file of interest in this project is `src/main/java/ngdc/csb/UniqueId.java`

See the [Unique ID Purpose](https://docs.google.com/document/d/142px-GiCxT1kVMZFMdvDpB-eCFI_gCqyUAGYruZIZOw/edit?usp=sharing) document.

## To Run
This project uses [Gradle](https://gradle.org/) as the build tool. A gradle wrapper script is supplied, 
`gradlew` (and `gradlew.bat` if you are running on Windows).
The 'gradlew' script behaves like gradle, but downloads gradle if you don't have it 
and then passes the arguments on to gradle. 'gradlew' also downloads and uses the version of gradle under
which this project was created, even if you already have a different version of gradle installed.
Typically the version of gradle won't matter, but the 'gradlew' script avoids the small chance that version
differences matter, so use 'gradlew' if the project provides it.

To run the example code, use: 

`./gradlew run`

This will build the project if needed before running it.

`./gradlew build` will create the runable program without running it.

To list available gradle commands:

`./gradlew tasks`