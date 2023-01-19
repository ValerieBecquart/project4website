# Utopia 2.0 Web Application
The game Utopia 2.0 is made available and can be played through this web application built with Java and the Spring Boot framework. Docker and Okteto were used to host the application. 
It can be accessed through the following link: https://utopia-utopiasite-kevinvandeputte-tm.cloud.okteto.net/

## Game
Since the game is built in a WebGL format, we were able to load it using an iframe. Hosting however, has not been done using Docker and Okteto because the build would not
allow it. Instead we used Netlify to host the game, and then load it on the web app. The repository used can be found [here](https://github.com/ValerieBecquart/unitybuild), and 
the game itself can be accessed through [this](https://cozy-baklava-a40b81.netlify.app/) link.

Besides hosting the game, the web application can also gather feedback from the user after playing the game. Different aspects of the game can be judged in a 
feedback form, and also a general score can be given. The form data is sent to the `feedback-service` which stores it in a `mongodb` database.

## Analytics
You have the possibility to consult data that is generated while by the users. The data is visualised with dashboards made in Qlik sense. These are then loaded onto the page using iframes. 

Two types of data are made available: 

1. Analytical data on visits to each station

The game gathers information on how many visits were made at each station, and takes into account the interests that visitors indicated at the start of the game. The data can be accessed only by adding `/analyse` to the base URL.

[Foto toevoegen]

2. Feedback sent by the users

Feedback entered by the users is also displayed. Feedback from the users can be used to further improve the game. The data can be accessed only by adding `/feedback` to the base URL.

[Foto toevoegen]
