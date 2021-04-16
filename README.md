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
...
```
2021-04-15 20:38:59.619  INFO 7908 --- [           main] c.e.a.AlmostPairADiceApplication         : Started AlmostPairADiceApplication in 3.308 seconds (JVM running for 3.731)
```
...

## Packages and Resources
The building blocks of the app comprises of packages. These are residing inside `src->main->java` folder

### Packages
The main packages are listed below and the java classes included.
* `com.example.almostpairadice.controller`: Controller classes contains REST APIs/endpoints
* `com.example.almostpairadice.dto`: Data Transfer Object classes used primarily in Controller class
* `com.example.almostpairadice.models`: Entity classes/persistence objects - class is an entity and is mapped to a database table
* `com.example.almostpairadice.repositories`: Dice Simulation Repository - encapsulating storage, retrieval, and search behavior which emulates a collection of objects


..To be continued
