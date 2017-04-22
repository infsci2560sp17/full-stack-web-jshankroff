# TennisCollab

1.	What is the proposed name for your Web application?
	- TennisCollab
2.	Who is the target audience for your Web application?
	- Primary audience is tennis players, with a secondary audience of those interested in watching or playing the sport, and there is a tertiary audience, which could include general sports enthusiasts that don’t play but want to find information on it.
3.	What problem is it intended to solve for the target audience?
	- Many people don’t know much information about the specifics of playing tennis.  There are different types of strings, rackets, shoes, equipment, etc., that all play differently on the court.  There is not only just equipment that is important, but knowledge of patterns and strategies is also important as well as the process of stringing rackets.  Knowing how every specific thing works is tough for one experienced person.  In my site the user will be able to sort through everything and find out what they need to know.  I will include reviews, strategies, and tutorials for stringing rackets properly. 
4.	How will it meet the minimum project requirements?
	- The plan for my project is to make it free for everybody to use so they can be better educated on the game of tennis.  That being said, all of the content will be freely accessible, but the user will need to login to access everything and to interact with each other on the site.  The logins for the users will be stored in a database.  The users will be able to update their information, as well as delete their account if need be.
5.	Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
	- My site will accommodate for interaction with both the site, and with other users.  On my site I’ll interact with the users and provide suggestions and other commentary to users who want more information, or want to be better educated.  Any member that is inactive for some time will get messages to persuade them to visiting the site.


## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-jshankroff)

## Changelog

[Changelog](CHANGELOG.md)

## Web Site

[TennisCollab](https://whispering-tundra-49243.herokuapp.com)

## Key Features

* User Login
* RESTful Web Service
* Users can add equipment
* Users can update equipment 
* Users can delete equipment

## Project Details

### Landing Page

To enter the site, the user would have to click on the green circle, which is supposed to resemble a tennis ball! [](https://cloud.githubusercontent.com/assets/25062496/25307923/d58f7138-2777-11e7-888e-85e6a6bfc298.png)

### User Input Form

This user input form is a login.  The user places a username and password into the correct fields to log in to the web application![](https://cloud.githubusercontent.com/assets/25062496/25307925/fcb55c1e-2777-11e7-9233-db5764437429.png)

## API

### API Method 1

    GET rackets/{id}

#### Parameters

- **id** _(required)_ — This API will return a racket for the given id.

#### Response

Returns a JSON object with the racket id.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    
    GET rackets/2

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    json {"id":2, "name":"Blade 16x19", "racketType":"Wilson"}
}
```

##### XML Response

None

## Technologies Used

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
