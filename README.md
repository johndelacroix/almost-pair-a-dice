# Dice Distribution Simulation

  

## Source code

The application code repository is located [on GitHub](https://github.com/johndelacroix/almost-pair-a-dice).

See [GIT documentation](https://git-scm.com/docs/git-clone) for more details about how to clone the GIT repository.

  

## Clone

* Clone the GIT repository as documented above to i.e. `D:/workspace/almost-pair-a-dice`


## Simulation and Test

To simulate the Dice Distribution Simulation, follow steps below:

1. The application was built using [Maven](https://maven.apache.org/).

* Install/configure MVN in your workstation in order to run this Springboot app 
* See [Installing Apache Maven](https://maven.apache.org/install.html) for more details about how to install Maven.

2. Open **cmd** in Administrator mode

3. Go to `almost-pair-a-dice` directory of the project using **cd** command

4. Run following script `mvn spring-boot:run`
* The log should have this at the end to confirm that it is already up with no issues:
```
2021-04-15 20:38:59.619  INFO 7908 --- [           main] c.e.a.AlmostPairADiceApplication         : Started AlmostPairADiceApplication in 3.308 seconds (JVM running for 3.731)
```

5. Run the following endpoints to simulate dice distribution:
* Roll the dices and display how many times each total has been rolled
* http://localhost:8080/diceroll (By default diceCount=3&diceSides=6&rollCount=100 but you can specify other values and append it in the endpoint i.e. `http://localhost:8080/diceroll?diceCount=6&diceSides=9&rollCount=69`)

Sample response:

```
[
   {
      "sum":32,
      "frequency":3
   },
   {
      "sum":33,
      "frequency":4
   },
   {
      "sum":34,
      "frequency":4
   },
   {
      "sum":35,
      "frequency":7
   },
   {
      "sum":36,
      "frequency":4
   },
   {
      "sum":37,
      "frequency":2
   },
   {
      "sum":39,
      "frequency":1
   },
   {
      "sum":41,
      "frequency":1
   },
   {
      "sum":44,
      "frequency":1
   },
   {
      "sum":45,
      "frequency":1
   },
   {
      "sum":20,
      "frequency":2
   },
   {
      "sum":21,
      "frequency":1
   },
   {
      "sum":22,
      "frequency":4
   },
   {
      "sum":23,
      "frequency":4
   },
   {
      "sum":24,
      "frequency":2
   },
   {
      "sum":25,
      "frequency":4
   },
   {
      "sum":26,
      "frequency":4
   },
   {
      "sum":27,
      "frequency":6
   },
   {
      "sum":28,
      "frequency":5
   },
   {
      "sum":29,
      "frequency":3
   },
   {
      "sum":30,
      "frequency":2
   },
   {
      "sum":31,
      "frequency":4
   }
]
```
* It will return a validation error once the number of dice and the total number of rolls are not met. 

Sample Response:
```
{"error":0,"message":"The number of dice and the total number of rolls must be at least 1."}
```
* It will return a validation error once the sides of dice is not met. 
Sample Response:
```
{"error":1,"message":"The sides of a dice must be at least 4."}
```

* Fetch the distribution from the rolls made. **Important:** You need to execute simulate the `diceroll` endpoint first before executing this. It will return `[]` if no simulations will be fetched from db
* http://localhost:8080/dicedistribution (By default diceCount=3&diceSides=6 but you can specify other values and append it in the endpoint i.e. `http://localhost:8080/dicedistribution?diceCount=6&diceSides=9`)

Sample response:
```
[
   {
      "diceCount":6,
      "diceSide":9,
      "sum":20,
      "frequency":2,
      "probability":0.028985508,
      "probabilityText":"2.90%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":21,
      "frequency":1,
      "probability":0.014492754,
      "probabilityText":"1.45%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":22,
      "frequency":4,
      "probability":0.057971016,
      "probabilityText":"5.80%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":23,
      "frequency":4,
      "probability":0.057971016,
      "probabilityText":"5.80%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":24,
      "frequency":2,
      "probability":0.028985508,
      "probabilityText":"2.90%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":25,
      "frequency":4,
      "probability":0.057971016,
      "probabilityText":"5.80%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":26,
      "frequency":4,
      "probability":0.057971016,
      "probabilityText":"5.80%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":27,
      "frequency":6,
      "probability":0.08695652,
      "probabilityText":"8.70%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":28,
      "frequency":5,
      "probability":0.072463766,
      "probabilityText":"7.25%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":29,
      "frequency":3,
      "probability":0.04347826,
      "probabilityText":"4.35%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":30,
      "frequency":2,
      "probability":0.028985508,
      "probabilityText":"2.90%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":31,
      "frequency":4,
      "probability":0.057971016,
      "probabilityText":"5.80%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":32,
      "frequency":3,
      "probability":0.04347826,
      "probabilityText":"4.35%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":33,
      "frequency":4,
      "probability":0.057971016,
      "probabilityText":"5.80%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":34,
      "frequency":4,
      "probability":0.057971016,
      "probabilityText":"5.80%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":35,
      "frequency":7,
      "probability":0.10144927,
      "probabilityText":"10.14%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":36,
      "frequency":4,
      "probability":0.057971016,
      "probabilityText":"5.80%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":37,
      "frequency":2,
      "probability":0.028985508,
      "probabilityText":"2.90%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":39,
      "frequency":1,
      "probability":0.014492754,
      "probabilityText":"1.45%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":41,
      "frequency":1,
      "probability":0.014492754,
      "probabilityText":"1.45%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":44,
      "frequency":1,
      "probability":0.014492754,
      "probabilityText":"1.45%"
   },
   {
      "diceCount":6,
      "diceSide":9,
      "sum":45,
      "frequency":1,
      "probability":0.014492754,
      "probabilityText":"1.45%"
   }
]
```


## Packages and Resources
The building blocks of the app comprises of packages. These are residing inside `src->main->java` folder

Resources folder(`src->main->resources`) contains folders for storing binary files, data files, image files, properties files, etc. which will be utilized by the Springboot application.

### Packages
The main packages are listed below and the java classes included.
* `com.example.almostpairadice.controller`: Controller classes contains REST APIs/endpoints
* `com.example.almostpairadice.dto`: Data Transfer Object classes used primarily in Controller class
* `com.example.almostpairadice.models`: Entity classes/persistence objects - class is an entity and is mapped to a database table
* `com.example.almostpairadice.repositories`: Dice Simulation Repository - encapsulating storage, retrieval, and search behavior which emulates a collection of objects

### Resources
* `application.properties`: Properties files are used to keep 'N' number of properties in a single file to run the application in a different environment
* `application-dev.properties`: This is the properties file used in dev environment
* `data.sql`: Contains DDL script for our in-memory database (H2)

### Database
H2 is one of the popular in memory databases. Spring Boot has very good integration for H2. An in memory database is created when an application starts up and destroyed when the application is stopped.

* This database is considered as we don't really need to save large bulk of data. This application is for simulation purposes only :)
* To properly set it up in a Springboot application, please check [Spring Boot with H2 Database](https://www.baeldung.com/spring-boot-h2-database)


## Code snippets
* The diceroll endpoint returns an **Object** as a response since it will either return a **List of Simulation** or an **Error Message Object**

```
...
    @GetMapping(value="/diceroll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> rollIt(@RequestParam(value = "diceCount", defaultValue = "3") int diceCount,
                                                       @RequestParam(value = "diceSides", defaultValue = "6") int diceSides,
                                                       @RequestParam(value = "rollCount", defaultValue = "100") int rollCount) {

        //0-9
        /*Random rand = new Random();
        int x = rand.nextInt(10);*/

        //validation
        if (diceCount < 1 || rollCount < 1) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("error", ErrorMessage.INPUT_ERROR.getCode());
            jsonObject.put("message", ErrorMessage.INPUT_ERROR.getDescription());
            return ResponseEntity.badRequest().body(jsonObject.toString());
        } else if (diceSides < 4) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("error", ErrorMessage.INPUT_DICE_SIDE_ERROR.getCode());
            jsonObject.put("message", ErrorMessage.INPUT_DICE_SIDE_ERROR.getDescription());
            return ResponseEntity.badRequest().body(jsonObject.toString());
        }
...
```


..To be continued
