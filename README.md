# Getting Started

## Windows
mvn clean
mvn compile
mvn package -e
mvn clean install

### Compile Code
* ./mvnw.cmd clean compile -e

### Test Code
* ./mvnw.cmd clean test -e

### Jar Code
* ./mvnw.cmd clean package -e

### Run Jar
* Local:      ./mvnw.cmd spring-boot:run 

* Background: nohup bash mvnw.cmd spring-boot:run &

### Testing Application
* Abrir navegador: http://localhost:8080/rest/msdxc/dxc?sueldo=100&ahorro=100000000
