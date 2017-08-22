
Follow:
http://www.ssaurel.com/blog/create-your-first-javafx-8-application-with-eclipse/

To be able to use JavaFX in your Java project on Eclipse, you need to enable it. Indeed, by default, Eclipse disallows access 
to classes in jar files in the jre/lib/ext directory, as these are not guaranteed to be available on all platforms. 
If you are writing a JavaFX 8 Application, you can assume you have jfxrt.jar in the lib/ext directory of your platform.

To enable it on your Eclipse project, go on Properties then Java Build Path. Double-click on your JRE System Library and 
select Access Rules. Click on Edit on the right menu. Now, you have to create a new Rule with Accessible resolution and 
the following Rule Pattern : javafx/** . This setting will enable JavaFX packages and classes for your application and will preserve 
the rule on the ext folder for all other classes.

....