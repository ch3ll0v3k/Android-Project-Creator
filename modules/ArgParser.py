#!/usr/bin/python
import sys, time
from optparse import OptionParser 


# #############################################################################################
class ArgParser(object):

    # ==========================================================================
    def __init__(self):

        # --------------------------------------------------------------
        self._USAGE = " %prog -n <AppName> -m <Min-SDK> -t <Target-SDK> -p <com.package> -c [default=False] "

        self.PARSER = OptionParser( 
            usage=self._USAGE, version="%prog 1.0", description="Description:"
        );

        self.PARSER.set_defaults( verbose=True );

        self.PARSER.add_option( '-n', '--name', action="store", 
            type="string", metavar="AppName", dest="name", default="TestApp", 
            help="New Project(App) Name? [default: %default] "
        );

        self.PARSER.add_option( '-m', '--min-sdk', action="store", 
            type="int", metavar="15", dest="min_sdk", default="15", 
            help="Select Minimal SDK-Version. [default: %default] "
        );

        self.PARSER.add_option( '-t', '--target-sdk', action="store", 
            type="int", metavar="19", dest="target_sdk", default="19", 
            help="Select Target SDK-Version. [default: %default] "
        );

        self.PARSER.add_option( '-p', '--package', action="store", 
            type="string", metavar="org.ch3ll0v3k", dest="package", default="org.ch3ll0v3k", 
            help="Name of [org.your.package] [default: %default] "
        );

        self.PARSER.add_option( '-c', '--compile', action="store_true", 
            dest="compile", default=False, 
            help="Compile Debug-Version after confiruration. [default: %default] "
        );

        self.PARSER.add_option( '', '--type', action="store", 
            type="string", metavar="[lib|project]", dest="type", default="project", 
            help="Type of project data. [default: %default" 
        );

        """
        - sdk                   : Displays the SDK Manager window.
        - avd                   : Displays the AVD Manager window.
        - list                  : Lists existing targets or virtual devices.
        - list avd              : Lists existing Android Virtual Devices.
        - list target           : Lists existing targets.
        - list device           : Lists existing devices.
        - list sdk              : Lists remote SDK repository.

        - create avd            : Creates a new Android Virtual Device.
        - move avd              : Moves or renames an Android Virtual Device.
        - delete avd            : Deletes an Android Virtual Device.
        - update avd            : Updates an Android Virtual Device to match the folders of a new SDK.

        - create project        : Creates a new Android project.
        - update project        : Updates an Android project (must already have an AndroidManifest.xml).
        - create test-project   : Creates a new Android project for a test package.
        - update test-project   : Updates the Android project for a test package (must already have an AndroidManifest.xml).

        - create lib-project    : Creates a new Android library project.
        - update lib-project    : Updates an Android library project (must already have an AndroidManifest.xml).

        - create uitest-project : Creates a new UI test project.
        """


        self.OPTS, self.ARGS = self.PARSER.parse_args();
        # --------------------------------------------------------------
        # print(self.OPTS);
        # {'min_sdk': 15, 'target_sdk': 19, 'verbose': True, 'package': 'org.ch3ll0v3k', 'compile': False, 'name': 'TestApp'}

        # --------------------------------------------------------------
        
    # ==========================================================================
    def AcceptSettings(self):

        # --------------------------------------------------------------
        print("===========================================================");
        print("| Settings preview:\n" );
        print("| {0:26}:['{1}']".format("Parameter:", "Value:"));
        print("--------------------------------------------------------");
        print("| {0:26}:['{1}']".format("Project-Type", self.OPTS.type) );
        print("| {0:26}:['{1}']".format("Project-Name", self.OPTS.name) );
        print("| {0:26}:['{1}']".format("Package-Name", self.OPTS.package) );
        print("| {0:26}:['{1}']".format("Min-SDK", self.OPTS.min_sdk) );
        print("| {0:26}:['{1}']".format("Target-SDK", self.OPTS.target_sdk) );
        print("| {0:26}:['{1}']".format("Compile after conf.", self.OPTS.compile) );
        print("--------------------------------------------------------\n");

        try:
            _answ = raw_input("Apply this settings: (Y/n) :#/ ");

            if _answ == "" or _answ == "Y" or _answ == "y":
                
                print(" Settings Accepted: Start in 2sec.\n");
                time.sleep(2);
                return True; 

            print(" Settings Rejected: Exit now!\n");
            return False;


        except KeyboardInterrupt as _aborted:

            print(" Aborted by user: Exit\n")

        # --------------------------------------------------------------

    # ==========================================================================
    def PRINT_HELP(self):

        # --------------------------------------------------------------
        self.PARSER.print_help();
        # --------------------------------------------------------------

    # ==========================================================================

# #############################################################################################
"""
if __name__ == '__main__':
    _ArgParser = ArgParser();
    self.AcceptSettings();

"""

