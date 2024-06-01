package org.example.z_interview;

public class Others {

    //Microsoft
    //
    //Nitya, Microsoft
    //Noida
    //
    //Java,MS,DSA. Design,
    //interview:
    //codility test : 100, 50%
    //codility 30-60 mins, Monday till 10AM.
    //
    //2nd round, 21st May. tuesday
    //virtual interview
    //
    //
    //..................
    //Pritesh, org: EY
    //direct payroll
    //Pune
    //Azure cloud
    //
    //
    //---
    //Go Model solutions

    //LITMindtree
    //P - technology
    //M - manager
    //
    //
    //p1
    //p2 ->
    //p3 -> i'm here, specialist role
    //p4
    //Timing 7:30 - 3:30
    //location : cyber city



    // 	[10:50 AM] P V, CHETHANA (Unverified)
    //String S='java is programming language';
    //get the count of each character
    //
    //Map<Character, Long> map = Arrays.stream(s.toLowerCase().split(" "))
    //.collect(Collectors.groupingBy(e->e, Collectors.counting()));
    //
    //map.forEach(e-> System.out.println(e->getKey() +" : "+e.getValue()));
    //
    //
    //
    //class loader
    //internal working of set
    //get and load
    //DI
    //IOC
    //Diff b/w JPA and hibernate
    //what all are the IOC.
    //diff b/w beanfactory and ApplicationContext
    //how many types of cache is there.
    //explain two types of cache.
    //first level and second level
    //
    //
    //algorithm of drools
    //agenda groupingBy



    //Thur, Fri: Impetus
    //Mon to Wed: client location, 1PM - 9:30
    //two office,


    //class SingletonClass{
    //
    //	private static SingletonClass obj;
    //
    //	private SingletonClass(){}
    //
    //	public static SingletonClass getIntance(){
    //		if(obj == null){
    //			obj = new SingletonClass();
    //		}
    //			return obj;
    //	}
    //}
    //
    //// Employee ->  with static
    //// Employee ->  without static

    //Given an array containing only 0’s, 1’s, and 2’s, in-place sort it in linear time and using constant space.
    //
    //Input : [0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0]
    //Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2]
    //
    //int arr = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};
    //int low =0;
    //int high = arr.lenght-1;
    //int mid = 0;
    //
    //while(mid<=high){
    //	if(arr[mid]==0){ //
    //		int temp = arr[low];
    //		arr[low] = arr[mid];
    //		arr[mid] = temp;
    //
    //		low++;
    //		mid--;
    //	} else if(arr[mid] == 1){
    //		mid++;
    //	} else {
    //		int temp = arr[mid];
    //		arr[mid] = arr[high];
    //		arr[high] = temp;
    //		high--;
    //	}
    //}
    //
    //
    ////mid<=high ->
    // arr[mid]  == 0
    //
    //
    //
    //Employee table
    //name, 	salary , dept.
    //abc 10k	Eng
    //Aakash	 20k	Eng
    //Gunjan	15K		HR
    //Rohit	25k		HR
    //
    //find emplyee, having salary is geater than avg in their dept.
    //
    //
    //select * from Employee where sal > (select * avg(salary) from Employee group by dept);

    ////CreditCard: id, name, type, expiryDate, customer, savingAccount, primeMember, active, ;
    //// saving account
    //// Customer : odActivated
    //CC : {
    //   customer : {
    //		accounts: [{
    //			svacc:{
    //			}
    //		}]
    //	}
    //}
    //
    //-> cc is having a field, prime member(boolean), convert true only if customer have more than 10L in saving a/c
    //->customer is having a/c, deactivated customer, null values in saving a/c
    //-> customer is having more than a 10 lac, this customer would be having a field, overDraftactivated odActivated.
    //
    //import com.example.CreditCard;
    //
    //rule "Check Customer is primeMember"
    //when
    //	$app : CreditCard(customer.isActive() &&
    //						customer.getSavingAccount().get(0).getAmount()>10L)
    //then
    //	$app.setPrimeMember(true);
    //	customer.setOdActivated(true);
    //	$app.setCustomer();
    //end
    //
    //
    //
    //
    //
    //
    //working memory & prod memory in drools
    //
    //
    //accpet: json/xml
    //return :
    //
    //hierarchy of logger
    //
    //
    //fully MS,
    //tech stack : java8 SB, aws.

    //1024blocks / 8
    //
    //125kb
    //.125mb
    //
    //1024 bit = 128 byte
    //
    //1gb = 1024mb
    //1mb = 1024kb
    //1kb = 1024byte
    //1 byte = 8 but
    //1024 bits = 128bytes
    //128 bytes
    //1kb = 1000bytes
    //1kibibytes = 1024 bytes


    //Corient :
    //Microsoft Graph API
    //Spring Boot
    //Azure
    //Salesforce UI
    //
    //


    //Quarkus said to be Supersonic Subatomic Java.
    //Supersonic gives you the impression of speed.
    //Quarkus is fast to work with. so as a developer, it's very fast, you change some code, it compiles automatically and you can test your code immediately. so its a much faster way to iterate through coding and testing.
    //but also speed in terms of executables, when you build an executable jar with Quarkus or an executable binary with GraalVM, the time to first response is very fast, way faster than other java frameworks.
    //then comes to subatomic. subatomic gives you the sensation of size. atomic, you know so you can think that everything is small. and yes, indeed it is.
    //when you build an executable jar, the size of the binary is way smaller, shorter than other java toolkits. and also it consumes less memory.
    //So Quarkus is very well optimized in terms of resource consumption.
    //
    //
    //you have a REST application and you deploy it, how long it it going to take to warm up the JVM, to warm up the server, your application and respond to the first request?
    //Well, with the traditional Java frameworks, it will take a bit more than 4 second to start and be able to repsond.
    //with Quarkus on HotSpot(JIT), you are under one second and quarkus with Graalvm(AOT), you are on .01 second.
    //
    //if you take a more complex application, so rest plus a db access, you have the same kind of percentage.
    //with Quarkus, it's four time faster.
    //
    //in terms of size, we can loot at the memory footprint. so again take a simple REST application, in traditional java frameworks the process will take 140 megabytes. here I'm talking about the memory of the entire process. not just the memory of the JVM.
    //
    //the same application deployed with Quarkus willt ake half of the memory.
    //and of course, with GraalVM, we reach not even 20megabytes of RAM.
    //
    //Quarkus pushes java to the cloud.
    //
    //GraalVM is an extension of the JVM, it actually comes as a separated bundle, so we need to install it separately. we will use GraalVM to create native binaries. basically, it will be used to analyze our code and then, with ahead-of-time(AOT) compilation, it will produce our native image.
    //
    //then comes Docker, so we will be using Docker at the very end to package the application as a docker image and execute this image inside a docker container. Quarkus has a set of extension when it comes to Docker and also Docker files. So when we will bootstrap our application, we will already have a set of docker files.



    //docker plugins
    //mvn plugins
    //kafka plugins
    //
    //
    //1. keep microservices ready
    //2. create terraform script. through script it will create kubernetes
    //3. aks cluster. create using terraform
    //4. define access control
    //5. setup jenkins pipeline.
    //6.
    //
    //
    //3 nodes
    //master node: 1 : managing whole cluster. handles network establishment of pods/services for deployment.
    //worker node: 2 : handle deployement of pods/services
    //why 3, if one worker nodes fail other one can take over. and we can have 2 master nodes if needed for high availability.
    //
    //ETDC cluster;persistent data cluster store. saves states. and it's basically db inside cluster.
    //
    //Webhook trigger : whenever you push code inside project/git. then jenkins pipeline will start running.
    //
    //polling: it always looking for changes in git.
    //
    //
    //
    //


    //created ubutu vm
    //2. installed jdk 11
    //wget : download package from internet
    //3. jenkins installed
    //4. login to jenkins
    //5. add plugins maven one.
    //6. tools -: add maven then name of maven and save/okay.
    //7. pipeline creation
    //8. cloning failed due to authentication. add authentication from jenkins itself.

    //sudo sh -c 'echo deb [signed-by=/usr/share/keyrings/jenkins.gpg] http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
    //
    //deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] https://pkg.jenkins.io/debian binary/
    //
    //deb [trusted=yes] https://pkg.jenkins.io/debian binary/
    //
    //
    //sudo wget -O /usr/share/keyrings/jenkins-keyring.asc \
    //https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key
    //echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] \
    //https://pkg.jenkins.io/debian-stable
    //binary/ | sudo tee \
    //  /etc/apt/sources.list.d/jenkins.list > /dev/null
    //sudo apt-get update
    //sudo apt-get install jenkins

    //Jenkins
    //Maven
    //Gradle
    //Travis Ci.
    //CircleCi
    //Bamboo
    //TeamCity

    //https://www.pulumi.com/registry/packages/azure/how-to-guides/classic-azure-ts-appservice-springboot/
    //
    //
    //https://learn.microsoft.com/en-us/azure/developer/jenkins/deploy-to-azure-spring-apps-using-azure-cli#create-a-jenkinsfile
    //
    //
    //https://youtube.com/watch?v=PKcGy9oPVXg
    //
    //https://v2-1.docs.kubesphere.io/docs/quick-start/devops-online/
    //
    //
    //
    //https://www.cloudthat.com/
    //
    //
    //
    //
    //CREATE KEYSPACE attendance_sys WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 3};
    //
    //CREATE TABLE attendance_sys.event_details (employeeid int,eventtimestamp timestamp,eventtype text, emailid text,PRIMARY KEY (employeeid, eventtimestamp));
    //
    //INSERT INTO attendance_sys.event_details (employeeid, eventtimestamp, eventtype, emailid) VALUES ('300', '2024-03-05 18:09:42', 'SWIPE_OUT', '300@gmail.com');
    //
    //SELECT employeeid, MIN(eventtimestamp) AS first_created FROM attendance_sys.swipe_events WHERE eventtype = 'SWIPE_IN' AND eventtimestamp >= '2024-02-24T08:30:00'  AND eventtimestamp < '2024-02-24T08:30:00' GROUP BY employeeid, eventid allow filtering;
    //
    //select * from attendance_sys.event_details;
    //
    //
    //
    //
    //CREATE DATABASE attendance_db;
    //
    //
    //-- 1. Inserting attendance record for employee 1 on 2024-02-28
    //INSERT INTO attendance (attendance_id, attendance_status, date, employee_id, total_time)
    //VALUES ('1', 'Present', '2024-02-28 08:00:00', 1, '8 hours');
    //
    //-- 2. Inserting attendance record for employee 2 on 2024-02-28
    //INSERT INTO attendance (attendance_id, attendance_status, date, employee_id, total_time)
    //VALUES ('2', 'Absent', '2024-02-28 08:15:00', 2, '0 hours');
    //
    //INSERT INTO attendance (attendance_id, attendance_status, date, employee_id, total_time) VALUES ('3', 'Late', '2024-02-28 08:30:00', 3, '8 hours');
    //
    //INSERT INTO attendance (attendance_id, attendance_status, date, employee_id, total_time) VALUES ('4', 'Present', '2024-02-28 08:00:00', 4, '8 hours');
    //
    //INSERT INTO attendance (attendance_id, attendance_status, date, employee_id, total_time)
    //
    //select * from attendance_db.attendance;


    //Docker is a way to create your application containers, and these containers have different objectives and ids. who are capable enough to run your application. Each container will contain your one segregated application which is capable enough to solve one particular task.
    //for examples, if we have multiple microservices we can create multiple containers for each microservices.
    //containers contains items, which is application + dependencies.
    //so if you go to docker desktop and and go to container and go into package. there will be three tabs. one for images, 2nd for vulnerabilities. and 3 is packages. then we can see all the dependencies will be there.
    //proper package with all its proper version and dependencies result will be packaged together into one single component and will be added to our container.
    //
    //so we can say we excapsulate our application and all its dependencies be it spring boot, spring security, etc everything, in one single package. so all these packages together will make our application run perfectly fine in any env.
    //
    //
    //What is docker :
    //docker is a containerization platform, which packages our application and all its dependencies together in the form of containers so that our application works seamlessly in any env,  be it developement, test or production.
    //Hence a container contains complete ecosystem of our application.
    //including the application and all of its dependencies and everything that is needed for an application to run on the server.
    //this gurantees that the s/w will always run the same, regardless of its env.
    //
    //
    //Containers are runtime instances of images that we create using docker file.
    //
    //
    //What are docker images?
    //Docker images are read only binary template(like snapshots) used to build containeres.
    //images also contains metadata that describe the container's capabilities and needs.
    //
    //to create a docker images, we run the docker build command. whenever we pass a dockerfile to the docker build command then the docker deamon will create a docker image according to the docker file instructions.
    //
    //Docker images can;t be executed by themselves and cannot run or start. it is just a blueprint for creating docker containers.
    //
    //to run the docker images, we use docker run command. whenever we pass the command to the docker client then the docker client passes this command to the docker deamon then docker daemon will create the container for that image.
    //
    //to push the docker image to the public regisgtry like DockerHub, we use docker push command after pushed we can access these images from anywhere using docker pull command.
    //
    //
    //what is a container ?
    //a container is a runnable instance of an image. you can create, start, stop, move or delete a container using docker api or CLI.
    //
    //containers provide you with a lightweight and platform independenct way of running your applications.
    //every container is isolated but access to resources on another host or container can be allowed with the help of docker networking.
    //
    //a container is volatile it means whenever you remove or kill the container then all of its data will be lost from it. if you want to persist the container data use the docker storage concept.
    //
    //containers only have access to resources that are defined in the image, unless additional access is defined when building the image into a container.
    //
    //all the docker images become docker containers when they run the on docker engine.
    //
    //
    //
    //better diaster recovery. disaster is unpredicatable. however we can backup a docker images (also called snapshot) for the state of the container at that backup moment, and retrieve it later when serious issues happen.
    //For example, a h/w failure just happened and you need to switch our work to a new h/w. with docker we can easily replicate the file to the new h/w
    //
    //
    //



    //Sneha
    //Deltek replicon
    //round : 3
    //HR Level,
    //Technical: manager, sr. director.
    //
    //
    //EY
    //
    //Delloite
    //1. Technical assessment - 1st April
    //2. tech round
    // 3. techno managerial round.
    //
    //Decimal technology
    //
    //
    //
    //Strangler Pattern
    //Side car Design Pattern
    //
    //
    //JDK8
    //Eclipse/Intellij
    //Maven 3
    //Gradle
    //Git
    //Jenkins
    //ActiveMQ
    //Apache Kafka
    //Mysql
    //MongoDB
    //Docker for windows
    //k8s (minikube)
    //
    //1. segragation of interfaces.
    //2. single responsbility (SRP)
    //3.
    //
    //
    //https://github.com/misguided-coder/publicis-java-may.git
    //
    //public class VehicleInfo{
    //	public long vehicleNumber(Vehicle vcl)
    //	{
    //		if(vcl instanceOf Car){
    //			retur vcl.getNumber();
    //		}if(vcl instanceOf Bike){
    //			retur vcl.getNumber();
    //		}if(vcl instanceOf Truck){
    //			retur vcl.getNumber();
    //		}
    //
    //	}
    //}
    //
    //public class VehicleInfo{
    //
    //	public long vehicleNumber(){
    //		// some functionality
    //	}
    //}
    //public class Car extends VehicleInfo{
    //
    //	@OVerride
    //	public long vehicleNumber(){
    //		return this.vehicleNumber;
    //	}
    //}
    //public class Bike extends VehicleInfo{
    //
    //	@OVerride
    //	public long vehicleNumber(){
    //		return this.vehicleNumber;
    //	}
    //}
    //public class Truck extends VehicleInfo{
    //
    //	@OVerride
    //	public long vehicleNumber(){
    //		return this.vehicleNumber;
    //	}
    //}
    //
    //
    //LSP
    //public class Rectangle{
    //	private double weight;
    //	private double height;
    //	public double area(){}
    //	public void setWidth(double width){
    //		this.width = width;
    //	}
    //	public void setHeight(double height){
    //		this.height = height;
    //	}
    //}
    //public class Square extends Rectangle{
    //
    //	@OVerride
    //	public double area(){
    //
    //	}
    //}
    //
    //
    //Solu:
    //class Vehicle{
    //	public void startEngine(){
    //		// the default implementation for engine start
    //	}
    //
    //		public void accelerate(){
    //		// the default implementation for accelerate
    //	}
    //}
    //
    //public class Car extends Vehicle{
    //	public void startEngine(){
    //		engageIgnition();
    //		super.startEngine();
    //	}
    //
    //	private void engageIgnition(){
    //	//logic
    //	}
    //}
    //
    //public class ElectricCar extends Vehicle {
    //	public void accelerate(){
    //		increaseVoltage();
    //		connectionIndividualsEngines();
    //	}
    //	private void increaseVoltage(){ }
    //	private void connectionIndividualsEngines(){}
    //}
    //
    //public class CarDriver {
    //
    //	public void drive(Vehicle c){
    //		v.startEngine();
    //		v.accelerate();
    //	}
    //}
    //
    //
    //round robin
    //
    //
    //public int test(){return 0;}
    //
    //
    //public int test(){return 0;}
    //public String test(){return ""}
    //
    //Observer : highlight
    //
    //Singleton
    //builder
    //factory
    //prototype
    //
    //property : values
    //bean
    //
    //flyweight: obj sharing, instead of creating multiple object.
    //proxy
    //
    //
    //adapter
    //
    //
    //strategy: decide algorithm on runtime
    //parent, child, .
    //
    //new comparator(){
    //
    //new comparator(){
    //compare{salary}}
    //
    //
    //
    //try{
    //}catch {}
    //catch(){}
    //
    //
    //two terms
    //Shed lock
    //distributed lock
    //When you have two instance of an application, and you have scheduler running on the same application, in this case it will be accessible on two instance, ideally it shouldn't, there where sbed locks comes into picture.
    //
    //Distributed lock :
    //Quardas
    //
    //
    //
    //str.chars().boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
    //map.entrySet().stream().filter(e->e.getValue()==1).findFirst().map(Map.Entry::getKey).orElse(Integer.valueOf(Character.MIN_VALUE));
    //
    //
    //Set set = new HashSet();
    //Map<Key, Value> map = new HashMap();
    //
    //key : 1
    //value : rajhree
    //
    //Predicate<Integer> obj = a -> a>25;
    //obj.test(10);
    //
    //public class A {
    //
    //	public void print(String msg){
    //
    //	return msg;
    //	}
    //
    //	main (){
    //
    //		Consumer<String> obj = A::print();
    //		obj.accept("hellow");
    //	}
    //int[] arr = new int[]{1,2,3};
    //
    //for(int i=0; i<arr.length();i++){
    //
    //
    //}
    //
    //list.stream().forEach(System.out::println(e-> e*e ));
    //list.stream.collect(Collectors.summingInt(employee::getNumber));
    //
    //creation singleton, protoype,  builder,
    //structure - flyweight, facade, adapte, bridge, decorator
    //behavioural - strategy, observer, chain of resposbility -exception, iterator -iterator.
    //
    //
    //shallow copy, deep copy, deep clone.
    //how to break singleton, reflection, deserialization.
    //
    //
    //microservices
    //retry circuit breaker(ressilience : dependancy @circuitbreaker, @retry), aggregate(completable future),
    //cqrs
    //saga
    //cherography
    //orchstration
    //
    //cloud gateway : single point of entry for client, abstraction over microservices.
    //
    //
    //
    //
    //
    //SingleThreadExecutor is a executor that has only a single thread. it is used when we need to execute tasks in a sequential order. in case when a thread dies due to some error or exception at the time of executing a task. a new thread is created, and all the subsequent tasks execute in that new one.
    //
    //ExecutorService executor = Executors.newSingleThreadExecutor();
    //
    //
    //FixedThreadPool(n);
    //that is a thread pool having a fixed number of threads. by this executor the submitted task is executed by the n thread. in case when we need to execute more xtasks after submitting previous tasks, they store in the linked Blocked queue. until previous tasks are not completed. the n denotes the total number of thread which are supported by underlying processor.
    //ExecutorService executor = Executors.newFixedThreadPool(4);
    //
    //
    //
    //ExecutorService executor = Executors.newFixedThreadPool(4);
    //for(int i = 0;i<5; i++){
    //Runnable task = new Task1(""+i);
    //executor.execute(task);
    //}
    //executor.shutdown();
    //
    //while(!executor.isTerminated()){
    //}
    //
    //
    //
    //
    //
    //new Thread(new Runnable(){
    //	@Override
    //	public void run(){
    //	sysout("print anything");
    //	}
    //}).start();
    //
    //
    //new Thread(new Runnable() {
    //	@Override
    //	public void run(){
    //	Sysout("print anything");
    //	}
    //}).start();
    //
    //
    //new Thread( ()-> {sysout("print anything");}).start();
    //
    //
    //@FunctionalInterface
    //interfacec Square{
    //	int calculate(int x);
    //}
    //
    //class Main{
    //	psvm(){
    //		Square s = (int x) -> x*x;
    //		int ans = s.calculate(6);
    //		sysout
    //	}
    //}
    //
    //
    //
    //Comparator<String> c = (s1,s2) -> s1.compareTo(s2);
    //(s1,s2) -> s1.compareTo(s2) : lambda expression
    //Comparator<String> c : functional interface
    //
    //
    //how default methods in interface cope up with diamond problem
    //
    //
    //
    //
    //spring annotation for sington
    //employee
    //id, name,
    //
    //Salary
    //emp id, ctc,
    //
    //
    //select name from employee as e inner join salary as s where s.ctc>1000;
    //customer class - junit
    //
    //@Mock
    //service
    //
    //Employee om = new Emp();
    //om.
    //when(service.test(any(HttpStatus.class))).thenreturn(em);
    //
    //controller.print();
    //
    //
    //
    //myapplication
    //controller -> service -> requestMapper
    //utility
    //
    //yaml contracts
    //
    //
    //Sql joins are used to retrieve data from multiple tables into a meaningful result set. it is performed whenever you need to fetch records from two or more tables. they are used to with select statement and join conditions.
    //
    //inner join
    //self join
    //left join
    //right join
    //left outer join
    //right outer join
    //full outer join
    //cross join
    //
    //
    //select * from employee_table emp inner join dept_table dept on emp.dept_id = dept_id
    //
    //select * from employee_table emp, employee_table emp2 where emp.dept_id = emp2.dept_id and emp.id != emp2.id
    //
    //select * from employee_table emp, dept_table dept;
    //select * from employee_table emp cross join dept_table dept;
    //select count(*) from employee_table emp, dept_table dept;
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //.... some code…
    //List<Integer> numbers = Arrays.asList(1,2,3,4,5,....,N);
    //List<Itenger> list = numbers.stream().filter(num-> num%2==0).collect(Collectors.toList());
    //Integer sum = sumOfAll(list);
    //System.out.println(sum);
    //.... some code…
    //
    //
    //public Integer sumOfAll(List<Integer> numbers){n%2==0
    //  return sum(1+2+3+4+5+..+N);
    //}
    //
    //
    //---------
    //String str1 = "Y";
    //System.out.println(str1.equalsIgnoreCase("Y") ? "Yes" : "No"); Yes
    //
    //String str2 = "";
    //System.out.println(str2.equalsIgnoreCase("Y") ? "Yes" : "No"); // No
    //
    //String str3 = null;
    //System.out.println(str3.equalsIgnoreCase("Y") ? "Yes" : "No");
    //System.out.println("Y".equalsIgnoreCase(str) ? "Yes" : "No"); // NPE // No
    //
    //String str4 = "N";
    //System.out.println(str4.equalsIgnoreCase("Y") ? "Yes" : "No"); // no
    //
    //Employee
    //id
    //name
    //email
    //
    //
    //static/ transient comment
    //
    //app.name=
    //
    //
    //@Value("app.name")
    //
    //@Entity
    //Employee
    //
    //@Column(ordinal = 0, type=PrimaryKeyType.Clus)
    //@Column(strategy=GenerationType.AUTO)
    //@ID
    //@Embeded
    //id
    //name
    //age
    //
    //
    //emp.save();
    //add.save();
    //
    //Employee emp
    //Mockito.when(obj.test(any())).thenReturn(emp);
    //
    //RestIOAssure
    //AssuredIO
    //
    //
    //@RestController
    //
    //public class EmployeeController{
    //
    //		@PostMapping("/add")
    //		public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
    //			service.addEmployee();
    //		}
    //
    //		@GetMapping(/getEmployess/{employeeid}/ pageNumber=${pageNumber})
    //		public ResponseEntity<List<Employee>> getEmployeeList(@RequestParam(name="")){ // offset,
    //		PageAble pageable = PageRequests.of(page, size);
    //			List<Employee> list = service.getEmployeeList(id);
    //		}
    //}
    //
    //@Service
    //public class EmployeeService{
    //
    //	@Autowired
    //	EmployeeRepo repo;
    //
    //	public void addEmployee(Employee emp) {
    //		repo.save(emp);
    //	}
    //
    //	public List<Epmloyee> getEmployees(int pageNumber, int pagesize){
    //		repo.findAllEmployee();
    //	}
    //}
    //
    //@Respository
    //public class EmployeeRepo{
    //
    //}
    //
    //
    //{id}
    //
    //// localhost:8080/getEmployees/10
    //// localhost:8080/getEmployees?pageNumber=10&&pageSize=10
    //
    //
    //
    //sorting
    //
    //
    //
    //
    //---
    //class A
    //class B extends A
    //class C extends A
    //class D extends C
    //
    //class A - run()
    //class B extends A - run() -> imp
    //class C extends A - run() -> imp
    //class D extends C,B
    //
    //
    //C.super.run();
    //
    //interface Test{
    //
    //list - 10 data
    //6
    //list.stream().filter(e-> e>10).collect(Collectors.toList());
    //}
    //
    //"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"
    //List<String> list = new ArrayList<>();
    //list.add("Pen");
    //list.add("Note Book");
    //list.add("Pen");
    //
    //Map<String, Long> map = list.stream().collect(Collectors.groupingBy(e->e), Collectors.counting());
    //map.entrySet().stream().map(Map.Entry::getKey).forEach(e-> System.out.println(e.getKey() +" :: "+e.getValue()));
    //
    //
    //1, Pen
    //
    //
    //
    //
    //--
    //ArrayList<String> arr = new ArrayList<String>();
    //arr.add("One");
    //arr.add("Two");
    //arr.add("Three");
    //arr.add("Four");
    //Iterator<String> iter = arr.iterator();
    //while (iter.hasNext()) {
    //	System.out.print(iter.next() + ", ");
    //	arr.add("Five");
    //}
    //
    //
    //class Complex {
    //	public static void f1()
    //	{
    //		System.out.println(
    //			"f1 method of the Complex class is executed.");
    //	}
    //}
    //class Sample extends Complex {
    //	public static void f1()
    //	{
    //		System.out.println(
    //			"f1 of the Sample class is executed.");
    //	}
    //}
    //public class Main {
    //
    //	public static void main(String args[])
    //	{
    //		Complex d1 = new Complex();
    //		Complex d2 = new Sample();
    //		d1.f1();
    //		d2.f1();
    //	}
    //}
    //
    //
    //
    //ArrayList<String> arr = new ArrayList<String>();
    //[A, B, C, A, A, D, C, D];
    //o/p: ABC**D**
    //
    //Employee : id, name, salary, list of mobile numbers.
    //
    //list.stream().flatmap(e-> e.getphonelist().stream()).collect(Collectors.toList());
    //
    //
    //int arr[] = {-2 -3 4 -1 -2 1 5 -3}
    //
    //7 (4 -1 -2 1 5)
    //
    //List<Integer> subArray = new Arraylist<>();
    //
    //int max = arr[0];
    //int a = arr[0];
    //int start = 0;
    //int end = 0;
    //int temp=0;
    //
    //for(int i =1; i<arr.length; i++){
    //	if(arr[i] > maxi+arr[i])
    //	{
    //			max = arr[i];
    //			temp = i;
    //	} else {
    //			max = max+arr[i];
    //	}
    //
    //	if(max> a){
    //		a = max;
    //		start = temp;
    //		end = i;
    //	}
    //}
    //
    //
    //for(){
    //subarray.add(arr[i])}
    //
    //for(int i =1; i<arr.length; i++){
    //	maxi = Math.max(arr[i], maxi+arr[i]);
    //	a = Math.max(a, maxi);
    //}
    //
    //
    //
    //
    //
    //
    //
    //Morgan 38
    //GS  26
    //UHG  35
    //Verizon 120
    //
    //Map<String, Integer> map = new HashMap<>();
    //map.put("Morgan",38);
    //
    //
    //Collection.sort(map, Comparator<Map.Entry<>>){
    //	public int compare(Map.Entry<String, Integer> a1, Map.Entry<String, Integer> a2){
    //		return a1.getValue().compareTo(a2.getValue());
    //	}
    //});
    //
    //
    //https://cpcontents.adobe.com/eu/public/newlearner/newlearner_7fec8fcf.html?accountId=652&userId=8666064#/course/2007379/overview?ci_id=2084300
    //
    //---
    //please print all elements starts with 1 using java stream
    //
    //List.of(1,23,12,45,100)
    //
    //import java.util.*;
    //
    //public class Main {
    //    public static void main(String[] args) {
    //     List<String> list = List.of(1,23,12,45,100)
    //     .stream()
    //     .mapToObj(s-> (String)s)
    //     .filter(s-> s.startWith("1"))
    //     .collect(Collectors.toList());
    //
    //     System.out.println(list);
    //
    //     list.stream().reduce("", (a)->a*a);
    //
    //
    //  }
    //}
    //
    //
    //
    //
    //---
    //
    //s&p global
    //2 days in office .
    //2 week
    //9 days in month
    // NTT Data: 3 days wfo
    //Impetus, : 2 day wfo. client yet to disclose.
    //TCS,
    //Nagarro: remote
    //Cognizant,
    //IBM,: depends on project, open hiring, 2 days wfo
    //Mindtree, : selected, yet to receive offer letter
    // HCL : offer letter is sent for approval, hence some delay.
    //Intuit,
    //DE Shaw
    //DirectI






    //Java
    //
    //What are the constructor and
    //how they differ from other methods of the class,
    //can we invoke one constructor from another constructor and
    //can we invoke the super class constructor from the child class constructor?
    //
    //A constructor is a method that is used to initialize the properties of an object when it is created.
    //It has the same name as the class name, unlike the other methods.
    //Constructor is only invoked when an instance or obj of that class is created, whereas the other methods can be invoked as many numbers of times as we want.
    //
    //To invoke other constructor's in the same class, we used the this() method, and we can pass the parameters just like any other parameters. like : this(90);
    //Class Accord {
    //	int speed;
    //	Accord(){
    //		this(90);
    //		this.speed = 59;
    //	}
    //
    //
    //And if class Accord exteds Honda class, to invoke the super classes constructor, the hondas constructor from within the class constructor, we use the super method and pass in any parameters.
    //
    //Class Accord exnteds Honda {
    //	int speed;
    //	Accord(){
    //		super(120);
    //		this(90);
    //		this.speed = 59;
    //	}
    //}
    //
    //
    //
    //What is diff b/w an abstract class and an interface, if a class has atleast on abstract method, then that class needs to be marked as abstract class, if not the class wont compile. any class that extends abstract class should then provide the implementation for these abstract methods in a abstract class.
    //if not that class should also be marked as abstract class.
    //
    //public abstract class A{
    //	void commonFun(){ inside commonFun method}
    //	abstract void test();
    //	abstract void test2();
    //	public static void main (String[] args){...inside main method}
    //
    //}
    //
    //abstract class can have any number of methods with mplementation, but as soon as it has one abstract method, it becomes abstract class. Whereas in interfaces all the methods are abstract.
    //the class that implements the interface, should provide the implementation for those abstract methods.
    //A class can implement any number of interfaces, whereas it can only extend one abstract class.
    //
    //
    //
    //Is multiple inheritance is supported in java?
    //no, it's not supported.
    //
    //
    //Can a class implement two interface with same exact method signature?
    //Yes. here I have interface Car, which has go() method which is void, and also a void stop() method.
    //ans also I have DriverLess interface which has go() method of void type, and the same go method we have in Car interface as well.
    //Now the Honda Class is implements both interface Car and Driverless.
    //
    //interface Car{
    //	void go();
    //	void stop();
    //}
    //interface DriverLess{
    //	void sitDownAndRelax();
    //	void go();
    //}
    //class Honda implements Car, DriverLess{
    //	@Override
    //	public void go(){
    //		sop(inside honda go);
    //	}
    //	@Override
    //	public void stop(){
    //		sop(inside honda stop);
    //	}@Override
    //	public void sitDownAndRelax(){
    //		sop(inside honda sitDownAndRelax);
    //	}
    //}
    //
    //
    //
    //What are the Objects classes?
    //What are the diff methods that every class inherits from the objects class
    //the diff methods that every class inherits from object class are equals() and hasCode(), clone(), and finalize() method, and toString() method.
    //we also have wait(), notify() etc but these can not overriden, but we can use those methods in multithreading  but these methods equals(), hashCode(), and finalize().
    //
    //
    //
    //If you do not override hashCode() and provide implementation for it in our class, what is the value that will be returned when we create objects of that class and invoke he hashCode().
    //The default hashCode() in the object class returns a value a number that is nothing but the memory location of that particular object. so if we dont provide our hashcode method the value that will come back is memory location of that object.
    //
    //
    //
    //What is default implementation of toString() do?.
    //if we dont override the toString() method in our classes, and if we try to point an object of that class, then we will see a value which will have the class name, followed by the @ symbol, and the hexadecimal representation of the memory location of that particular object so that is default implementation of toString method in objet class.
    //
    //Employee@7852e922
    //
    //
    //
    //
    //Why Strings are immutation?
    //what are advantages?
    //Immutability means unchangeable or unmodifiable.
    //Once a string is created, it's data cannot be changed.
    //for ex: String s1 = "Hello";
    //
    //JVM will allocate memory location and put the string in there, s1 will point that string value or that memory location. now if we changed it to String s1 = "Hello World";
    //the same memory location will not be udpated, a new memory will be created and this Hello World will live in that memory location.
    //
    //Advantage:
    //memory, if we have multiple variables using the same string value, they will all point to the same memory location. if one of them changes it, then a new memory will be allocated.
    //Thread Safe: you dont need to worry about  multiple thread manipulation the string and chaning it. bcz once a thread changes it, it will point to a new memory location so it will not be updating the same string, which makes it very secure as well.
    //
    //
    //
    //equals() and == operator
    //diff b/w these two?
    //
    //
    //Employee e1 = new Employee();
    //e1.setId("1");
    //e1.setName("Rajshree");
    //Employee e2 = new Employee();
    //e2.setId("1");
    //e2.setName("Rajshree");
    //
    //e1==e2 // false bcz the == operator compares the obj reference or the memory locations and not the content of the obj. so we can call it shallow comparison not deep.
    //e1.equals(e2) // true as it compares and check for content within the object. it's deep comparison.
    //the default implementation of the equals() method is internally using == operator, so it's bydefault shallow comparison.
    //
    //----------
    //
    //Microservices : microservices is a collections of services. Basically we can say that microservices is an architecture where application is exposed as loosely coupled service that can be independently developed, deployed and maintained. Each microservices exposed is referred to as microservice. Each service perform a unique function.
    //
    //
    //Why Microservices
    //in case of monolithic application, there are several problems like
    //- same code base for presentation, business layer, and data access layer. application is deployed as a single unit.
    //- complex to maintain & scalability is an issue.
    //Microservices solve the above problem.
    //microservice are idea when a monolithic or legacy application needs to modernized.
    //
    //Microservices are ideal for new s/w, if the key business drivers are to reduce time to market, scalable better s/w lower costs, faster developement or cloud native development.
    //
    //Each service is independent and gives the flexibility to choose the programming language, db and//or architecture.
    //
    //Distinct services can be developed, deployed and maintained independently.
    //
    //
    //Pros of Microservices:
    //- freedom is use diff technology.
    //- each microservices focuses on single capability
    //- support individual deployable units.
    //- Allow frequent s/w release.
    //- multiple services are parallely developed and deployed.
    //
    //
    //
    //Cons of Microservices:
    //- management of large number  of services is difficult.
    //- communication b/w microservices is complex.
    //- increased efforts for configuration & other operations.
    //- difficult to maintain txn safety & data boundaries.
    //- due to the decentralized nature of microservices more microservices will mean more resources hence high investment.
    //- debugging of problem is harder unless the right instrumentation is followed during design and developement.
    //- microservice  will need large team size & with the right mix of experience in design, development, automation, deployments, tools & testing.
    //
    //
    //When to use Microservices
    //- reduce the time to market
    //- Scalable better s/w
    //- lower costs
    //- faster developments
    //- cloud native development
    //- it makes sense to adopt a microservices architectureif the team size is big enough as each services will require its team to develop, deploy and manage. Timeframe & skills of team members are a constraint if fast results are required.
    //
    //
    //
    //Distributed Txn : a txn that spans across multiple microservices.
    //
    //
    //Autonomy : Each service operates autonomously, eliminating the problems caused by interdependency. This also allows freater deployment flexibility.
    //
    //Scalability : Service can scale up or down instantly in response to demand, optimizing resource allocation and cost.
    //
    //Resilience : if one service goes down, if doesn;t affect the other service. The s/w can also recover from failures more rapidly.
    //
    //Decentralization : development teams can work independently, accelerating tie to market and improving productivity.
    //
    //Load Balancing : the architecture can distribute incoming traffic evenly across servers. this prevents overloads and improves performance.
    //
    //Devops Integration : By integrating DevOps into microservices architecture, you can ensure rapid delivery of high quality services.
    //
    //continuous monitoring : real time monitoring tools ensures the highest levels of performance, security and availability.
    //
    //Fault Tolerance : the system continues to function even if one or more service fail, ensuring a consistent user experience.
    //
    //
    //
    //What are Microservices Design Pattern?
    //(
    //https://dzone.com/articles/design-patterns-for-microservices
    //https://www.openlegacy.com/blog/microservices-architecture-patterns/
    //)
    //Microservices Design Pattern are s/w patterns that generates reusable autonomous services. The aim is to allow developerse who use microservices to speed up application release by letting teams deploy  each microservices independently as needed.
    //
    //Design Pattern in Microservices.
    //design patterns in microservices : 5 main categories.
    //All of the below are under two main category which is client -side and server-side
    //
    //Decomposition : Decompose by business capability, Decompose by subdomain, Decompose by Transactions, Strangler Pattern, BulkHead Pattern, Sidecar Pattern.
    //
    //Integration : API gateway pattern, Aggregator Pattern, Proxy pattern, Gateway Routing pattern, Chained Microservice Pattern, Branch Pattern, Client-side UI composition.
    //
    //Database : Database per service, Shared database per service, CQRS, Event Sourcing, Saga Pattern
    //
    //Observability : Log Aggregation, Performance Metrics, Distributed Tracing, Health Check
    //
    //Cross Cutting concern : External Configuration, Service Discovery Pattern, Circuit Breaker Patter, Blue- green deployment
    //
    //Integration - API Gateway : The api gateway pattern is designed to solve the problem that can be caused by decomposing an application nto separate services. These an include issues with requesting information from multiple microservices or handling several protocol requests simultaneously.
    //
    //api gateway can be considered as a proxy service. it acts as an entry point for all microservices and route request to the correct service or services. The result then can be sent back to composite or consumer serviecs. By using api gateway, microservices can communicate with each other via a stateless server. for example using either Http request or a message bus.
    //
    //In addition, a microservices api gateway can expose the api's specific to each client serviceand create a more tailored user experience. It can also offload the responsibility for microservices authentication and authorization. In this way, it can provide extra layer of security of your sensitive data.
    //
    //The Downside of this pattern is that it adds an extra layer of complexity to the system. However, this is mitigated by the fact you can move ome of the logic from the client application to the gateway. This simplifies the client application and reduces the number of requests to your backend systems.
    //
    //Backend for frontend
    //backend for frontend, also known as BFF, is a variant of the API gateway design pattern that provides an extra layer b/w client applications and microservices.
    //
    //unlike the api gateway pattern, BFF isn't a single point of entry. instead of, it introduces a separate gateway for each client. with this approach, you can add an api tailored to specific requirements.
    //
    //For example, a company might have a web application, a mobile application and a third-party application. with the BFF pattern, a separate API can be added for each app instead of a single bloated API being used for all three. This not only improves user experience but also enhances system performance as each app can call the backend in parallel.
    //
    //A BFF approach provides extensive business capabilities and is ideal for the continuous delivery of microservices architecture on a large scale. This pattern can also be used to accomodate the functions of particularly complex apps or create separate gateways for different business domains.
    //
    //Developers often like this model as it's flexible and can be used to respond to most microservice situation. However, this doesn't mean every microservices based architecture should use a BFF pattern. After all , the more complexities there are in the design, the more setup you require.
    //
    //
    //Cross Cutting Concern patterns - Blue Green Deployment
    //A blue-green deployment strategy can reduce the risks of latency and downtime caused by multiple microservices falling under the umbrella of one application.
    //
    //This pattern involves always running two identical production environment: Blue and Green. only one the these env is live at any time, serving all production traffic. when a developer is ready to upload a new version of the service, they can upload it to the inactive env. This way, developers can perform any necessary tests without disrupting service.
    //
    //Once the s/w is ready, the live env is swiched to the new version. The old version becomes inactive but remains operational. if the new version experiences any problems, the service can be switched back to the older version.
    //
    //Many, if not all, cloud native architecture (https://www.openlegacy.com/blog/what-is-cloud-native-architecture) platform provides options for implementing blue-green eployment. This is beneficial as the pattern is a great way to reduce downtime and increase the resilience of microservices architecture.
    //
    //
    //Cross Cutting Concern patterns - Circuit Breaker Pattern
    //Microservices involves lot of calls b/w applications and services. if a service has failed, the unanswered calls can use up important resources and create a cascade of failures across the system. The circuit breaker pattern provides protection againts this possibility.
    //
    //Inspired by electrical circuit breaker, this microservice design pattern breaks the connections to the failed service. any calls to the breaker are routed to a diff services or result in an error default message, preventing protected calls from being made and left 'hanging'. This happens for a set 'timeout' period.
    //
    //3 states
    //1. Closed : everything is working fine, circuit breaker is closed.
    //2. Open : if start failiing then it will go to open state and we can configure
    //3. Half Open :
    //when your service is partially down,
    //a calling b
    //b calling c and d
    //now c is completly down. then it will be partial failure, then what we will do in this case.
    //cassacading failure or partial happen in this case we will make use of bulk head.
    //resilience
    //threshold
    //retry is there in circuit breaker.
    //
    //
    //
    //
    //Hibernate
    //Eager : when you are accessing any data of employee, it will load related mapping data as well.
    //LAzy : when you are accessing any data of employee, it will load related mapping data when you call get address/get post.
    //
    //
    //
    //
    //
    //Once the circuit breaker's timeout period is over, it will allow a small num of requests though again. If these are successful, the service will resume its normal functioning. However if there's another failure, the timeout period will begin again.
    //this pattern can improve availability and performance by preventing network resource from becoming deplected. However, it is important to balance preventing failures and maintaining service levels.
    //
    //
    //Cross Cutting Concern patterns - Service Discovery
    //When it comes to container technology, IP address are allocated to service instance. This means each time an address change, consumer service may break & will require a manual adjustment.
    //
    //a service database, k/w as service Registry, is created to store the metadata for each producer serviceand specification. A service insrtance should register to the service registrywhen starting and also de-register if shutting down.
    //There are2 types of service discovery
    //
    //1. client side: the client queries service registry directly to find the location of a service instance. this model reduces the number of network hops needed. however, you must implement ervice discoverylogic separately for each language or framework your application uses, increasing the complexity of the client code.
    //
    //2. Server Side: the client queries the service registry indirectly via a load balancer. In this model, the client code is simpler, but there are more moving parts to maintain nd monitor. more network hopsare also needed, which may introduce latency.
    //
    //
    //Cross Cutting Concern patterns - Saga Design Pattern
    //one of the biggest problem with Mimcroservices is how to work around transactions that span multiple services.  The Saga pattern can help with this.
    //
    //Saga allows developers to manage e-commerce txn across multiple microservices using a sequence of local txns. Each of these is accompanied by an event that will trigger the next stage.
    //
    //As part of this approach if one txn fails, a rollback txn is triggered to compensate.
    //
    //The downtime of this pattern is that it requires a more complex programming model. Developersmust design rollback txns to undo the change that caused a failure. They must also ensure coordination b/w services.
    //
    //
    //Observability - Distributed Tracing
    //In a microservice architecture, requests may span multiple services. Each service deals with a client request by performing one or more operations across multiple services. This can make troubleshooting difficult, as it's hard to track end-to-end requests.
    //
    //Distributed Tracing is one of the solution to this problem. with this pattern a distributed tracer gives each request a unique id. It also  records information about the request, such as which service are called, and which operations are performed.
    //
    //developers can use this information to trace request from begining to end, helping them find the root cause of any issues. they can also monitor how service interacts and how long it takes each services to process requests, which is useful for pinpointing latency.
    //
    //
    //Observability - Log Aggregation
    //Each microservices generates a standardized log file about it's activities. This can be useful in cases where an application may consists of several services. Request oftern require multiple serice instance.
    //
    //However, there needs to be centralized logging service that can compile logs from each service instance. This is where log aggregation comes in: it normalizes and consolidates logs from diff microservices and stores them on a centralized platform.
    //
    //Developers can search and analyze logs on the platform. they can also create alertsthat are triggered when certain problem message appear, simplifying issue resolution.
    //
    //
    //Observability - Performance Metrics
    //gather data about individual performance (such as latency and CPU performance) and consolidate it.
    //
    //
    //Decomposing Pattern - Decompose by capability
    //‘Business capability’ generates value for a business. The particular mix of business capabilities depends on the nature of the enterprise.
    //
    //For instance, the capabilities of an online tech sales company include sales, marketing, accounting, etc. Each business capability may be thought of as a service (but one that’s business-oriented as opposed to technical).
    //
    //To decompose an application into smaller services, it can be beneficial to use the business capability pattern
    //
    //This pattern results in a stable microservices architecture as business capabilities are generally stable. However, its success relies on the ability to identify each specific business capability.
    //
    //Users can also encounter problems with so-called ‘God Classes’, which aren’t as easy to decompose. This is because these classes are common among multiple services. For instance, the ‘order’ class can apply to order management, order delivery, order tracking, etc.
    //
    //
    //
    //Decomposing Pattern - Decompose by subdomain
    //Domain-driven design (DDD) can resolve the God Class issue by using subdomains and bounded context concepts.
    //
    //This pattern starts by breaking the domain model into subdomains, such as ‘core’ and ‘supporting’ activities or features. Each subdomain has a model with a scope known as the ‘bounded context’. Microservices are developed based on this.
    //
    //This pattern is ideal for decomposing complex applications and supporting agile development. It’s also a great way to increase the flexibility and scalability of your architecture.
    //
    //Bear in mind, though, that you need to be able to understand exactly how the business works to identify relevant subdomains. This means developers should analyze a company, including its organizational structure and areas of expertise, before acting.
    //
    //
    //Decomposing Pattern - Decompose By transactions
    //Another pattern involves decomposing via transactions. With this pattern, each transaction and its supporting components belong to a single microservice. For instance, you could create an order management microservice and a payment processing microservice.
    //
    //This pattern solves many problems that arise when transactions span multiple services, like increased latency and complexity. This in turn can simplify the process of developing, testing, and maintaining the system.
    //
    //On the other hand, this pattern has the potential for an excessive proliferation of microservices that may actually increase complexity. So, developers must carefully consider the scope of each transaction and whether decomposing with this pattern is feasible.
    //
    //
    //Sidecar pattern
    //During the sidecar pattern (also known as the sidekick pattern), components of an application are positioned in a separate processor container. This provides isolation and encapsulation, which aids fault isolation.
    //
    //You can use this pattern to encapsulate an app’s supporting functions, like monitoring and configuration, or it can enable applications to be composed of heterogeneous components and technologies.
    //
    //The sidecar is attached to a ‘parent application’ and provides assisting features for this. It also shares the same lifecycle as the parent since it’s created and retired alongside it.
    //
    //
    //Bulkhead pattern
    //The bulkhead pattern is so named because it resembles the sectioned partitions of a ship’s hull. It works by isolating elements of an application into separate sections. If one fails, the others can continue to function.
    //
    //These partitions are created based on consumer load and availability. It helps to isolate failures, allowing you to keep a service functioning for some customers, even while others are experiencing failure.
    //
    //This can be a useful pattern for businesses that receive large volumes of customers at once. It can also be combined with the circuit breaker pattern for enhanced fault isolation.
    //
    //
    //Vine pattern
    //It’s difficult to apply the patterns we’ve discussed so far to legacy applications since these applications are already live. That’s not to say cloud-based microservices can’t support legacy systems, you just need the right pattern.
    //
    //The vine pattern, also known as the strangler pattern, resembles a vine wrapping itself around a tree. When it’s applied to web applications, a message goes back and forth for every Uniform Resource Identifier (URI) call, and the services can then be broken down into different domains. Unlike some services, these domains are hosted separately.
    //
    //The two separate services can stay side by side in the same URI space, with a single domain taken into account at any one time. The new refactored app wraps around or ’strangles‘ the original app until you’re able to shut down the older, monolith application.
    //
    //This pattern lets you migrate data and features gradually from the monolith to the new microservices without interrupting the user experience. For the duration of the migration, developers should make sure both systems can access the relevant resources.
    //
    //
    //
    //
    //
    //What are the different types of Microservice Architecture?
    //https://www.openlegacy.com/blog/how-cloud-native-architectures-support-legacy-systems
    //
    //
    //
    //
    //
    //
    //----------------------------
    //What is Spring Boot
    //what?
    //it is a spring module and is a framework for rapid application development(RAD) using framework with extra support of auto-configuration & embedded application server like tomcat, jetty, netty and undertow etc.
    //why ?
    //it provides RAD
    //How?
    //it helps us in creating efficient fast stand alone application which you can just run it basically removes a lot configuration and dependencies.
    //
    //
    //What is RAD? how can you achieve RAD using spring boot?
    //RAD is modified waterfall model focus on developing s/w in a short span of time.
    //Phase of RAD are as follows:
    //Business Modeling : it is designed for the product to be developed.
    //Data Modeling : it is designed the relations b/w these data objects are established using info gathered in first place.
    //Process Modeling : it is designed, process discription for adding, deleting, retrieving or modifying a data objects are given.
    //Application Generation : The actual product is built using coding. Convert processing & data models into actual prototypes.
    //Testing & Turnover : Product is tested & if changes are required then whole process start again.
    //
    //
    //@RestController ?
    //@RestController is a convenience annotation for creating restful controllers. it is a specialization of @Component & is autodetected through classpath scanning. it adds the @Controller & @ResponseBody annotations. it converts the response to json or xml.
    //which eliminates the need to annotate every req handling method of the controller class with the @ResponseBody annotation. it is typically used in combination with annoted handler methods based on the @RequestMapping annotation.
    //It indicates that the data returned by each method will be written straight into the response body instead of rendering a template.
    //
    //
    //
    //Spring Actuator : it is an additional features taht helps us to monitor manage your application when you push it to production. these features include auditing, health & metrics gathering & many more features that can be automatically applied to your applications.
    //using spring boot actuator, you can access these flows like what bean is created, what is the CPU usage, http hits that your server has handled.
    //
    //Enabling HTTP Trace
    //Before 2.2x spring boot you can just add dependency and expose that using :
    //management.endpoints.web.exposure.include=*
    //
    //But after 2.2x http trace doesn't work at all.
    //this is not a bug in spring boot rather its a legitimate change done bcz the default implementation stores the captured data in memory.
    //hence it consumes much memory & memory is a pretty costly & precious. that is why this feature is now turned off by default & has to be turned on by the user explicitly if needed.
    //To fix this issue just create the bean of HttpTraceRepository which is in memory repository. this will store the last 100 Http req-res exchange into your memory.
    //
    //How to make custom endpoints in actuator:
    //@Component
    //@Endpoint(id="customActuator")
    //public class CustomActuator{
    //	@ReadOperation
    //	public String currentDbDetails(){
    //		return "Given current db static of application";
    //	}
    //}
    //
    //@ReadOperation -> maps to http get
    //@WriteOperation -> maps to http post
    //@DeleteOperation -> maps to http delete
    //
    //by adding @Bean annotated with @Endpoint any method annoted with @ReadOperation, @WriteOperation & @DeleteOperation are automatically exposed over JMX or Http.
    //
    //
    //
    //Steps To Deploy SB web application as a JAR & war files
    //to deploy a SB web application, you just have to add following plugin in the pom.xml files
    //<build>
    //	<plugins>
    //		<groupId>org.springframework.boot</groupId>
    //		<artifactId>Spring-boot-maven-plugin</artifactId>
    //	</plugins
    //</build>
    //by using above plugin, you will get a jar executing the package phase. this jar will contain all the necessary libraries & dependencies required. It will also contain on embedded server. so, you can basically run the application like an ordinary JAR file.
    //NOTE: the packaging element in the pom.xml file must be set to jar to build a jar file as below
    //<packaging>jar</packaging>
    //or
    //<packaging>war</packaging>
    //
    //
    //
    //advantage of yaml file over property file
    //1. more clarity & better readability.
    //2. perfact for hierachical confirugation data which is also represented in a better or more readable format.
    //3. support for maps, list & scalar types.
    //
    //@RestController
    //@ConfigurationProperties(prefix="yaml")
    //@PropertySource(value="classpath:application.yml", factory=YamlPropertySourceFactory.class)
    //public class EmployeeController
    //{
    //
    //}
    //
    //public class YamlPropertySourceFactory implements PropertySourceFactory throws IOException{
    //	@Override
    //	public PropertySource<?> createPropertySource(String name, EncodedResource encodedResource){
    //		// we used the yaml property factory bean to convert the resource in yaml format to the java.util.Properties objects
    //
    //		YamlPropertySourceFactory factory = new YamlPropertySourceFactory();
    //		factory.setResource(encodedResource.getResource());
    //		Properties properties = factory.getObject();
    //		return new PropertiesPropertySource(encodedResource.getResource().getFileName(), properties);
    //	}
    //}
    //
    //Different ways to load yaml file in SB
    //- YamlMapFactoryBean to load yaml file as map
    //- YamlPropertiesFactoryBean to load yaml as properties
    //
    //Which is given preference yaml or property file in SB
    //application properties file are given preference over application.yaml file in SB application.
    //
    //
    //
    //What is REST & Restful
    //- REST represents REpresentation state transfer.
    //- Restful web services are web services that follow REST architectural concept(stateless client server architecture)
    //- it is an architectural style for developing application that can be occurred over network.
    //
    //
    //What is a REST resource
    //
    //What is URI
    //uniform Resource Identifier
    //whic is used for identifying each resource of the REST architecture.
    //URI is of the format:
    //<protocol>://<service-name>/<resourceType>/<resourceId>
    //https://en.wikipedia.org/wiki/Representation-State-Transfer
    //2 types:
    //1. URN
    //2. URL
    //
    //what are the Http methods
    //Get: fetch details from server read only operations.
    //POST: create the new resource on server.
    //PUT: update the old/existing resource on the server or replace the resource.
    //DELETE: to delete resource on the server/
    //PATCH: to modifying the resource on the server.
    //
    //GET, HEAD, OPTIONS are safe & idempotent methos whereas PUT& DELETE methods are only idempotent. POST & PATCH methos are neither safe nore Idempotent.
    //
    //what are the feature of Restful web services.
    //- service is based on client server model.
    //- the service uses http protocol for fetching data/resource, query execution, or any other function.
    //- the medium of communication b/w the client & server is called "Messaging".
    //- Resource are accessible to the service by using URLs.
    //- it follows the stateless concept where the client req & res are not dependent on others & thereby provides total assurance of getting the required data.
    //- these service also use the concept of caching to minimize the server calls for same type of repeated req.
    //
    //
    //what is concept of stateless in REST?
    //as per REST architecture, a Restful web service should not keep a client state on server. This restriction is called stateless.
    //It is responsbility of the client to pass its context to server & then server can store this context to process client's futher req for example, session maintained by server is indentifier passed by the client.
    //
    //Controller :
    //are responsible
    //accept the request from client & deligate that to bussiness layer
    //
    //Business/Service:
    //validation
    //logic
    //send data to DAO layer
    //
    //DAO
    //send data to db server to save
    //once it's saved dao layer will return you response to business layer & business layer to controller & through controller to client.
    //
    //What are the spring boot starter?
    //spring boot starter is a maven template that contains a collection of all the relevant transitive dependencies that are needed to start a particular functionality.
    //Spring boot actuator is a set of features that provides monitoring & management capabilities for your spring boot applications.
    //actuator endpoints : exposes information about your application, such as health status, metrics & env vari. that can be used to monitor & manage your application.
    //
    //How do you configure same property with diff. values for diff ways?
    //profiles
    //-@profiles is used to map components & beans to a certain profile.
    //spring.profile.active=dev.
    //-profiles names can also be passed in via a jvm system parameter. these profiles will be activated during application startup:
    //-Dspring.profile.active=dev
    //- set up profiles using the spring application
    //SpringApplication.setAdditionalProfiles("dev");
    //
    //
    //Criteria API in hibernate:
    //session.createCriteria(Employee.class).add(Restrictions.like("name","A%")).list();
    //will return all employee objects having name starting with A.
    //
    //Native SQL queries
    //Query query = session.createSqlQuery("Select * from table t where t.name=:name")
    //						.addEntity(Employee.class)
    //						.setParameter("fullName","Hibernate");
    //List list = query.list();
    //
    //
    //@Autowired
    //used for automatic dependency injection. it is key component of the IOC principal that spring is built upon.
    //take care by spring container.
    //
    //@Confitional
    //
    //@Interface -> mean custom annotation
    //@Target(ElementType.Method)
    //@Retention(RetentionPolicy.Runtime)
    //@Constraint(validateBy={})
    //public @interface UniqueEmailValidator{
    //
    //}
    //
    //@Target(ElementType.Field)
    //@Target(ElementType.Method)
    //@Target(ElementType.Type)
    //
    //@Retention(RetentionPolicy.Runtime)
    //@Retention(RetentionPolicy.Classloading)
    //
    //
    //
    //
    //
    //
    //
    //CompletableFuture :
    //CompletableFuture proves flexible way to write asynchronous, non-blocking code. It was introduced in java8.  it is class in ava.util.concurrent package that implements the Future and CompletionStage interface.
    //It represents the future results of asynchronous computation.
    //we can say, I mean can be thought of as a container that holds result of an asynchronous operations that is being executed in different thread. it provides a number of methods to perform various operations on the result of async computation.
    //
    //To create a CompletableFuture we can make use of static method supplyAsync() which accepts supplier as an input argument. supplier is a functional interface which takes no values and return a result.
    //
    //CompletableFuture<String> cf = CompletableFuture.supplyAsync(()-> {return "Hello from CompletableFuture"});
    //cf.get();
    //
    //This creates a CompletableFuture that will executed the lambda function passed to supplyAsync() in a separate thread. and after the execution, the result lambda function is returned by CompletableFuture Object.
    //
    //Composing CompletableFuture:
    //thenApply(Function)
    //thenCombine(CompletionStage, BiFunction)
    //thenAccept(Consumer)
    //thenCombine(Function)
    //
    //CompletableFuture<String> helloFuture
    //            = CompletableFuture.supplyAsync(() -> "Hello");
    //CompletableFuture<String> greetingFuture
    //            = CompletableFuture.supplyAsync(() -> "World");
    //
    //CompletableFuture<String> combinedFuture
    //            = helloFuture.thenCombine(
    //                greetingFuture, (m1, m2) -> m1 + " " + m2);
    //
    //System.out.println(combinedFuture.get());
    //
    //Handling Exception in CompletableFuture
    //CompletableFuture<Integer> resultFuture
    //          // java.lang.ArithmeticException: / by zero
    //            = CompletableFuture.supplyAsync(() -> 10 / 0)
    //                      .exceptionally(ex -> 0);
    //
    //// 0 - returned by exceptionally block
    //System.out.println(resultFuture.get());
    //Inside supplyAsync, when 10 is divided by 0, It will throw ArithmeticException and control will go to exceptionally block and which in turn returns 0.
    //
    //What's the difference b/w runAsync and supplyAsync
    //supplyAsync accepts supplier and return something.
    //runAsync accepts runnable and return void. so if you want to perform some logic/calculation and dont want to return anything you must use runAsync.
    //
    //CompletableFuture.allOf(); // it will wait for all completable future to complete the execution.
    //CompletableFuture.anyOf(); // return any of the completable future results.
    //
    //--------
    //
    //There are two ways of creating threads - one by extending the thread class and other by creating a thread with a runnable. However, one feature lacking in Runnable is that we cannot make a thread return result when it terminates, i.e. when run() completes. For supporting this feature, the callable interface is represent in java.
    //for implementing runnable, the run() method needs to be mplemented which does not return anything.
    //while for a callable, the call() method needs to be implemented which return a result of completion.
    //NOTE: a thread can't be created by using callable, it can only be created by runnable interface.
    //Another diff. is that call() method can throw exception whereas run() method can't.
    //
    //
    //CAllable :
    //public Object call() throws Exception;
    //
    //public class CallableExample implements Callable {
    //	public Object call() throw Exception{
    //
    //	 // Create random number generator
    //		Random generator = new Random();
    //
    //		Integer randomNumber = generator.nextInt(5);
    //
    //		// To simulate a heavy computation,
    //        // we delay the thread for some random time
    //		Thread.sleep(randomNumber*1000);
    //		return randomNumber;
    //	}
    //}
    //
    //
    //Future :
    //when call() method completes, answer must be stored in n object k/w to the main thread, so that main thread know about the result that the thread returned.
    //think of a Future as an object that holds the result- it may not hold it right now, but it will do so in future(Once the callable returns).
    //Thus, a future is basically one way the main thread can keep track of the progress and result from other threads.
    //
    //Observe that Callable and Future do two different things - Callable is similar to Runnable. in that it encapsulates a task that is meant to run on another thread, Whereas Future is used to store a result obtained from a diff thread. In fact, The future can be made to work with Runnable as well, which is something that will become clear when executors come into the picture.
    //
    //public Object get() throws InterruptedException, ExecutionException: Used to get the result of the task. If the task is complete, it returns the result immediately, otherwise it waits till the task is complete and then returns the result.
    //
    //public class CallableExample implements Callable {
    //	public Object call() throw Exception{
    //
    //	 // Create random number generator
    //		Random generator = new Random();
    //
    //		Integer randomNumber = generator.nextInt(5);
    //
    //		// To simulate a heavy computation,
    //        // we delay the thread for some random time
    //		Thread.sleep(randomNumber*1000);
    //		return randomNumber;
    //	}
    //}
    //public class CallableFutureTest{
    //	psvm(){
    //
    //	// FutureTask is a concrete class that implements both Runnable and Future
    //		FutureTask[] randomNumberTask = new Future[5];
    //		for(int i=0; i<5;i++){
    //			Callable callable = new CallableExample();
    //
    //			// Create the FutureTask with Callable
    //			randomNumberTask[i] = new FutureTask(callable);
    //
    //			// As it implements Runnable, create Thread with FutureTask
    //			Thread t = new Thread(randomNumberTask[i]);
    //			t.start();
    //		}
    //
    //		for (int i = 0; i < 5; i++)
    //		{
    //		  // As it implements Future, we can call get()
    //		  System.out.println(randomNumberTasks[i].get());
    //
    //		  // This method blocks till the result is obtained
    //		  // The get method can throw checked exceptions
    //		  // like when it is interrupted. This is the reason
    //		  // for adding the throws clause to main
    //		}
    //	}
    //}
    //
    ////
    //
    //Callable<String> callableTask = () -> {
    //            System.out.println("Call method called.");
    //            TimeUnit.MILLISECONDS.sleep(2000);
    //            return "Task execution in call method";
    //        };
    //
    //Future<String> future =
    //        executorService.submit(callableTask);
    //System.out.println(future.get());
    //
    //List<Future<String>> futures = executorService.invokeAll(callableTasks);
    //
    //Future interface, A Future is the result of asynchronous tasks that may be completed in the future. Future also provides methods to check if the computation is complete, to wait for its completion, and to retrieve the result of the computation(example get() method).
    //
    //
    //--------
    //
    //ForkJoinPool Class in Java with Examples
    //The ForkJoinPool class is the center of the fork/join framework, which is an implementation of the ExecutorService interface. ForkJoinPool class is an extension of the AbstractExecutorService class, and it implements the work-stealing algorithm (i.e., worker threads that run out of things to do can steal tasks from other threads that are still busy) of fork/join framework and can execute ForkJoinTask processes.
    //
    //The ForkJoinPool class inherits the following methods from java.util.concurrent.AbstractExecutorService class:
    //
    //invokeAll()
    //invokeAny()
    //The ForkJoinPool class inherits the following methods from Methods inherited from class java.lang.Object class:
    //
    //clone()
    //equals()
    //finalize()
    //getClass()
    //hashCode()
    //notify()
    //notifyAll()
    //wait()
    //
    //
    //Fork: Fork step splits the task into smaller subtasks and these tasks are executed concurrently.
    //
    //Join: After the execution of the subtasks, the task may join all the results into one result.
    //----
    //https://medium.com/javarevisited/a-complete-guide-on-executorservice-in-java-67528f1a535b
    //
    //https://medium.com/@vinodhgowda/understanding-executorservices-types-in-java-62ded89f6bdd
    //
    //ExecutorService
    //ExecutorService is the interface which allows us to execute tasks on threads asynchronously. this interface present in java.util.concurrent package.
    //it helps in maintaining a pool of thread and assign them tasks. it also provides the facility to queue up tasks until there is a free thread available if the number of task s more than the thread available.
    //
    // Creating and maintaining a pool of threads for task execution
    //→Maintain a queue for tasks that cannot be executed at the moment due to thread unavailability
    //→Handle Thread lifecycle efficiently
    //→Manage Thread synchronisation
    //
    //ExecutorService es = Executors.newSingleThreadExecutor();
    //ExecutorService es = Executors.newFixedThreadPool(10);
    //ExecutorService es = Executors.newScheduledThreadPool(10);
    //ExecutorService es = Executors.newCacheThreadPool();
    //
    //execute(Runnable task)
    //submit(Runnable task) / submit(Callable<T> task)
    //invokeAny(Collection<? extends Callable<T>> tasks)
    //invokeAll(Collection<? extends Callable<T>> tasks)
    //
    //ExecutorService es = Executors.newSingleThreadExecutor();
    //es.execute(new Runnable(){
    //	@Override
    //	public void run(){
    //		System.out.println("test");
    //	}
    //});
    //es.shutdown();
    //
    //The submit() method takes in a runnable object and returns a Future object. This object is later on used to check the status of Runnable whether it has completed execution or not.
    //ExecutorService es = Executors.newSingleThreadExecutor();
    //es.submit(new Runnable(){
    //	@Override
    //	public void run(){
    //		System.out.println("test");
    //	}
    //});
    //
    //
    //Single Thread Executor:
    //→ExecutorService wherein only a single thread is created and maintained to process the tasks coming in.
    //On Creation Facts:
    //→ThreadPool size is always 1 i.e., core size and the maximum size of the thread pool will always be 1.
    //→Creates an unbounded LinkedBlockingQueue which stores the tasks to be executed
    //Usage:
    //→Best used for background tasks and system resources like CPU cycles, Memory etc… aren’t to be drained
    //→When there is a need to handle all the tasks in sequence, the order in which the tasks are submitted
    //
    //Fixed ThreadPool Executors:
    //Executor Service which creates a thread pool wherein the number of threads is equal to ‘nThreads’. If all the threads are busy then the pending tasks should wait for threads to complete their current tasks
    //On Creation Facts:
    //→ThreadPool size is equal to the value of ‘nThreads’. The pool size is maintained at all cost. If a thread terminates due to failure in executing its current task, a new thread is created and introduced into the thread pool
    //→Creates an unbounded LinkedBlockingQueue which stores the tasks to be executed
    //Usage:
    //→When there is a need to maintain a fixed number of threads for task execution
    //
    //Scheduled ThreadPool Executors:
    //As the name signifies, this ExecutorService creates a pool of threads that can execute tasks periodically or at scheduled delays
    //On Creation Facts:
    //→ThreadPool size is equal to the value of “corePoolSize”
    //→The executor is reconfigurable i.e, the pool-size can be increased or decreased
    //→Creates an unbounded LinkedBlockingQueue which stores the tasks to be executed
    //Usage:
    //→When there is a need to handle events that recur at a fixed interval of time or at certain known/expected delays
    //
    //Cached ThreadPool Executors:
    //As aptly titled, a thread pool is created wherein the threads are added as per requirement. The thread pool grows or shrinks as per the task load.
    //On Creation Facts:
    //→Previously created threads are used whenever available
    //→When a thread is not available to process a task, a new thread is created
    //→If a thread stays idle for 60 seconds, the thread is terminated and removed from the thread pool
    //→Creates an unbounded LinkedBlockingQueue which stores the tasks to be executed
    //Usage:
    //→Best suited when ’n’ number of short-lived tasks are to be executed
    //
    //-------
    //
    //Java Design Pattern
    //https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial
    //
    //
    //Creational Design Pattern
    //Structural Design Pattern
    //Behavioral Design Pattern
    //J2EE Design Pattern
    //
    //Creational Design Pattern :
    //It provides solutions to instantiate an object in best way possible for specific solutions.
    //1. Singleton Pattern
    //Singleton Pattern Principal :
    //- Singleton Pattern restrict the instantiation of class and ensures that only one object created and exists in JVM.
    //- Singleton class must provide global access point to get the instance of class.
    //- used in logging, drivers object/connection, caching, thread pool
    //- singleton design pattern used in core java classes : java.lang.Runtime, java.awt.Desktop
    //
    //3 things must have
    //1. private constructor to restrict the instantiation of class from outer class.
    //2. private static vari which is object of the class.
    //3. provide global access point which will return the instance of class from method.
    //
    //1. Eager Initialization
    //the instance of the singleton class is created at the time of class loading. the drawback to eager initialization is created even though the client application might not be using it.
    //
    //public class SingletonTest{
    //	private static final SingletonTest obj = new SingletonTest();
    //	private SingletonTest(){}
    //	public static SingletonTest getInstance(){
    //		return obj;
    //	}
    //}
    //
    //2. Static-Block Initialization
    //its's similar to eager initialization, instance of the singleton class is created inside static block and provides the exeption handling.
    //public class SingletonTest{
    //	private static SingletonTest obj;
    //	static {
    //		try{
    //			obj = new SingletonTest();
    //		} catch (Exception e) {
    //            throw new RuntimeException("Exception occurred in creating singleton instance");
    //        }
    //	}
    //	private SingletonTest(){}
    //	public static SingletonTest getInstance(){
    //		return obj;
    //	}
    //}
    //
    //3. Lazy Initialization
    //instance of class is created in global access point(public method).
    //public class SingletonTest{
    //	private static SingletonTest obj;
    //	private SingletonTest(){}
    //	public static SingletonTest getInstance(){
    //		if(obj == null) {
    //			obj = new SingletonTest();
    //		}
    //		return obj;
    //	}
    //}
    //it works fine in single thread enviornment,  but when it comes to multithreaded system, it can cause issue if multiple thread are the inside "if" condition at the same time. it will destroy the singleton patternand both threads will get different instance of the singleton class.
    //
    //4. Thread Safe Singleton
    //to create thread safe singleton class, we can make a global access method synchronized so that only one thread can execute this method at a time.
    //public class ThreadSafeSingleton {
    //
    //    private static ThreadSafeSingleton instance;
    //
    //    private ThreadSafeSingleton(){}
    //
    //    public static synchronized ThreadSafeSingleton getInstance() {
    //        if (instance == null) {
    //            instance = new ThreadSafeSingleton();
    //        }
    //        return instance;
    //    }
    //
    //}
    //
    //double check locking
    //
    //public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
    //    if (instance == null) {
    //        synchronized (ThreadSafeSingleton.class) {
    //            if (instance == null) {
    //                instance = new ThreadSafeSingleton();
    //            }
    //        }
    //    }
    //    return instance;
    //}
    //
    //5. BillPugh
    //public class BillPughSingleton {
    //
    //    private BillPughSingleton(){}
    //
    //    private static class SingletonHelper {
    //        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    //    }
    //
    //    public static BillPughSingleton getInstance() {
    //        return SingletonHelper.INSTANCE;
    //    }
    //}
    //
    //6. Using Reflection to destroy Singleton Pattern
    //public class ReflectionSingletonTest{
    //	public static void main(String[] args){
    //		SingletonTest instanceOne = SingletonTest.getInstance();
    //		SingletonTest instanceTwo = null;
    //		try{
    //			Constructor[] constructors = SingletonTest.class.getDeclaredConstructors();
    //			for(Constructor constructor: constructors){
    //				//this will destroy pattern
    //				constructor.setAccessible(true);
    //				instanceTwo = (SingletonTest)constructor.newInstance();
    //				break;
    //			} catch(Exception e){
    //				e.printStackTrace();
    //			}
    //			System.out.println(instanceOne.hashCode);
    //			System.out.println(instanceTwo.hashCode);
    //		}
    //	}
    //}
    //when you run preceding test class, you will notice that hashcode of both instances is not the same which destroy the singleton pattern Reflection is very powerful and used in a lot of frameworks like spring and hibernate.
    //https://www.digitalocean.com/community/tutorials/java-reflection-example-tutorial
    //
    //
    //
    //
    //Factory Design Pattern
    //factory design pattern is used when we have super class with multiple sub classes and based on the input , we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.
    //
    //interface Profession{
    //    void display();
    //}
    //
    //class Doctor implements Profession{
    //    @Override
    //    public void display(){
    //        System.out.println("logic to display through Doctor");
    //    }
    //}
    //
    //class Teacher implements Profession{
    //    @Override
    //    public void display(){
    //        System.out.println("logic to display through Teacher");
    //    }
    //}
    //
    //class Engineer implements Profession{
    //    @Override
    //    public void display(){
    //        System.out.println("logic to display through Engineer");
    //    }
    //}
    //
    //public class ProfessionFactory{
    //	public Profession getProfession(String typeOfProfession){
    //		if(typeOfProfession == null)
    //			 return null;
    //		if(typeOfProfession.equalsIgnoreCase("Doctor")){ return new Doctor();}
    //		else if(typeOfProfession.equalsIgnoreCase("Teacher")){ return new Teacher();}
    //		else if(typeOfProfession.equalsIgnoreCase("Engineer")){ return new Engineer();}
    //	}
    //}
    //
    //public class FactoryPatternMainClass{
    //	psvm(){
    //		ProfessionFactory factory = new ProfessionFactory();
    //		Profession doc = factory.getProfession("Doctor");
    //		doc.display();
    //	}
    //}
    //
    //Factory Design Pattern Examples in JDK
    //java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
    //valueOf() method in wrapper classes like Boolean, Integer etc.
    //
    //
    //
    //
    //Abstract Factory Design Pattern
    //Abstract Factory pattern is almost similar to Factory Pattern except the fact that its more like factory of factories.
    //in factory design pattern, we have a single Factory class. This factory class returns different subclasses based on the input provided and factory class uses if-else or switch statement to achieve this. In the Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. Then an Abstract Factory class that will return the sub-class based on the input factory class. At first, it seems confusing but once you see the implementation, it’s really easy to grasp and understand the minor difference between Factory and Abstract Factory pattern. Like our factory pattern post, we will use the same superclass and sub-classes.
    //
    //interface Product{
    //    void display();
    //}
    //
    //class ConcreteProductA implements Product{
    //    @Override
    //    public void display(){
    //        System.out.println("logic to display through product A");
    //    }
    //}
    //
    //class ConcreteProductB implements Product{
    //    @Override
    //    public void display(){
    //        System.out.println("logic to display through product B");
    //    }
    //}
    //
    //interface Factory{
    //    Product factoryMethod();
    //}
    //
    //class ConcreteFactoryA implements Factory{
    //    @Override
    //    public Product factoryMethod(){
    //        return new ConcreteProductA();
    //    }
    //}
    //
    //class ConcreteFactoryB implements Factory{
    //    @Override
    //    public Product factoryMethod(){
    //        return new ConcreteProductB();
    //    }
    //}
    //public class FactoryThroughInterfaceDemo {
    //
    //    public static void main(String[] args){
    //        Factory factoryA = new ConcreteFactoryA();
    //        Product productA = factoryA.factoryMethod();
    //        productA.display();
    //
    //        Factory factoryB = new ConcreteFactoryB();
    //        Product productB = factoryB.factoryMethod();
    //        productB.display();
    //    }
    //}
    //
    //Abstract Factory Design Pattern Examples in JDK
    //javax.xml.parsers.DocumentBuilderFactory#newInstance()
    //javax.xml.transform.TransformerFactory#newInstance()
    //javax.xml.xpath.XPathFactory#newInstance()
    //
    //Abstract Factory design pattern provides approach to code for interface rather than implementation.
    //Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, for example we can add another sub-class Laptop and a factory LaptopFactory.
    //Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.
    //
    //
    //
    //
    //Builder Design Pattern
    //Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes. There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
    //
    //Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.
    //Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
    //If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
    //We can solve the issues with large number of parameters by providing a constructor with required parameters and then different setter methods to set the optional parameters. The problem with this approach is that the Object state will be inconsistent until unless all the attributes are set explicitly. Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.
    //
    //Builder Design Pattern in Java
    //Let’s see how we can implement builder design pattern in java.
    //
    //First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.
    //Java Builder class should have a public constructor with all the required attributes as parameters.
    //Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.
    //The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument.
    //Here is the sample builder pattern example code where we have a Computer class and ComputerBuilder class to build it.
    //
    //public class Employee{
    //	private String id;
    //	private String name;
    //	//optional field
    //	private String email;
    //	private String comment;
    //	private Employee(String email, String comment){
    //		this.email = email;
    //		this.comment = comment;
    //	}
    //
    //	public class static EmployeeBuilder{
    //		private String id;
    //		private String name;
    //		private String email;
    //		private String comment;
    //
    //		public EmployeeBuilder(String email){
    //			this.email = email;
    //		}
    //
    //		public String setEmail(String email){
    //			this.email = email;
    //			return this;
    //		}
    //
    //		public String setComment(String comment){
    //			this.comment = comment;
    //			return this;
    //		}
    //
    //		public Employee build(){
    //			return new Employee(this);
    //		}
    //	}
    //}
    //public class TestBuilderPattern {
    //
    //	public static void main(String[] args) {
    //		//Using builder to get the object in a single line of code and without any inconsistent state or arguments management issues
    //		Employee emp = new Employee.EmployeeBuilder().setEmail("abc@gmail.com")
    //				.setComment("test").build();
    //	}
    //}
    //
    //Builder Design Pattern Example in JDK
    //Some of the builder pattern example in Java classes are;
    //
    //java.lang.StringBuilder#append() (unsynchronized)
    //java.lang.StringBuffer#append() (synchronized)
    //
    //
    //5. Prototype Design Pattern
    //The prototype pattern is used when the Object creation is costly and requires a lot of time and resources, and you have a similar Object already existing. So this pattern provides a mechanism to copy the original Object to a new Object and then modify it according to our needs. This pattern uses Java cloning to copy the Object. The prototype design pattern mandates that the Object which you are copying should provide the copying feature. It should not be done by any other class. However, whether to use the shallow or deep copy of the object properties depends on the requirements and is a design decision.
    //
    //
    //Structural Design Pattern
    //1. Adapter Design Pattern
    //it is one of the structural design patterns and is used so that two unrelated interface can work together. The Object that joins these unrelated interfaces is called an adapter.
    //
    //Adapter Design Pattern Example in JDK
    //Some of the adapter design pattern example I could easily find in JDK classes are;
    //
    //java.util.Arrays#asList()
    //java.io.InputStreamReader(InputStream) (returns a Reader)
    //java.io.OutputStreamWriter(OutputStream) (returns a Writer)
    //
    //public interface MediaPlayer{
    //	public void play(String audioType, String fileName);
    //}
    //public interface AdvanceMediaPlayer{
    //	public void playVlc(String fileName);
    //	public void playMp4(String fileName);
    //}
    //public class VlcPlayer implements AdvanceMediaPlayer{
    //	@Override
    //	public void playVlc(String fileName){
    //		System.out.println("inside vlc");
    //	}
    //	@Override
    //	public void playMp4(String fileName){
    //		// do nothing
    //	}
    //}
    //public class Mp4Player implements AdvanceMediaPlayer{
    //	@Override
    //	public void playVlc(String fileName){
    //		// do nothing
    //	}
    //	@Override
    //	public void playMp4(String fileName){
    //		System.out.println("inside mp4");
    //	}
    //}
    //public class MediaAdapter implements MediaPlayer{
    //	AdvanceMediaPlayer advancedMusicPlayer;
    //	public MediaAdapter(String audioType, String fileName){
    //		if(audioType.equalsIgnoreCase("vlc") ){
    //			advancedMusicPlayer = new VlcPlayer();
    //		}
    //		if(audioType.equalsIgnoreCase("mp4") ){
    //			advancedMusicPlayer = new Mp4Player();
    //		}
    //	}
    //
    //	@Override
    //	public void play(String audioType, String fileName){
    //		if(audioType.equalsIgnoreCase("vlc")){
    //         advancedMusicPlayer.playVlc(fileName);
    //		}
    //		else if(audioType.equalsIgnoreCase("mp4")){
    //         advancedMusicPlayer.playMp4(fileName);
    //		}
    //	}
    //}
    //public class AudioPlayer implements MediaPlayer{
    //	MediaAdapter mediaAdapter;
    //
    //   @Override
    //   public void play(String audioType, String fileName) {
    //
    //      //inbuilt support to play mp3 music files
    //      if(audioType.equalsIgnoreCase("mp3")){
    //         System.out.println("Playing mp3 file. Name: " + fileName);
    //      }
    //
    //      //mediaAdapter is providing support to play other file formats
    //      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
    //         mediaAdapter = new MediaAdapter(audioType);
    //         mediaAdapter.play(audioType, fileName);
    //      }
    //
    //      else{
    //         System.out.println("Invalid media. " + audioType + " format not supported");
    //      }
    //   }
    //}
    //public class AdapterPatternDemo {
    //   public static void main(String[] args) {
    //      AudioPlayer audioPlayer = new AudioPlayer();
    //
    //      audioPlayer.play("mp3", "beyond the horizon.mp3");
    //      audioPlayer.play("mp4", "alone.mp4");
    //      audioPlayer.play("vlc", "far far away.vlc");
    //      audioPlayer.play("avi", "mind me.avi");
    //   }
    //}
    //
    //
    //
    //2. Composite Pattern
    //The composite pattern is used when we have to represent a part-whole hierarchy. When we need to create a structure in a way that the objects in the structure have to be treated the same way, we can apply the composite design pattern.
    //
    //
    //3. Proxy Pattern
    //The proxy pattern provides a placeholder for another Object to control access to it. This pattern is used when we want to provide controlled access to functionality.
    //It lets you provide a substitude or placeholder for another obj.
    //proxy controls the access to perform something either before or after the request gets through to the original obj.
    //
    //client --> calls/create/proxy instance -> Proxy -> calls method of real subject only after proper security check & authentication.
    //
    //public interface Subject{
    //	public void method();
    //}
    //public class RealSubClass implements Subject{
    //	@Override
    //	public void method(){
    //		SYSOUT("test");
    //	}
    //}
    //public class ProxyClass extends RealSubClass{
    //	@Override
    //	public void method(){
    //	// authenticate req if authenticated call real object else dont
    //		SYSOUT("final");
    //		super.method();
    //	}
    //}
    //public class ClientClass{
    //	psvm(){
    //		Subject proxy = new ProxyClass();
    //		proxy.method();
    //	}
    //}
    //
    //
    //
    //4. Flyweight Pattern
    //The flyweight design pattern is used when we need to create a lot of Objects of a Class. Since every Object consumes memory space that can be crucial for low-memory devices (such as mobile devices or embedded systems), the flyweight design pattern can be applied to reduce the load on memory by sharing Objects.
    //
    //String pool implementation in Java is one of the best examples of flyweight pattern implementation.
    //
    //Intrinsic attribute - common attribute
    //Extrinsic attribute - unique attribute
    //client -> calls/create- factory instance -> Factory -> factory
    //container map & logic to create new obj if not in map else return if key exist in map.
    //
    //5. Facade Pattern
    //The facade pattern is used to help client applications easily interact with the system.
    //
    //6. Bridge Pattern
    //When we have interface hierarchies in both interfaces as well as implementations, then the bridge design pattern is used to decouple the interfaces from the implementation and to hide the implementation details from the client programs. The implementation of the bridge design pattern follows the notion of preferring composition over inheritance.
    //
    //7. Decorator Pattern
    //The decorator design pattern is used to modify the functionality of an object at runtime. At the same time, other instances of the same class will not be affected by this, so the individual object gets the modified behavior. The decorator design pattern is one of the structural design patterns (such as adapter pattern, bridge pattern, or composite pattern) and uses abstract classes or interface with the composition to implement. We use inheritance or composition to extend the behavior of an object, but this is done at compile-time, and it’s applicable to all the instances of the class. We can’t add any new functionality to remove any existing behavior at runtime – this is when the decorator pattern is useful.
    //
    //
    //
    //Behavioral Design Patterns
    //1. Template Method Pattern
    //The template method pattern is a behavioral design pattern and is used to create a method stub and to defer some of the steps of implementation to the subclasses. The template method defines the steps to execute an algorithm, and it can provide a default implementation that might be common for all or some of the subclasses.
    //
    //2. Mediator Pattern
    //The mediator design pattern is used to provide a centralized communication medium between different objects in a system. If the objects interact with each other directly, the system components are tightly-coupled with each other which makes maintainability cost higher and not flexible to extend easily. The mediator pattern focuses on providing a mediator between objects for communication and implementing loose-coupling between objects. The mediator works as a router between objects, and it can have its own logic to provide a way of communication.
    //
    //3. Chain of Responsibility Pattern
    //The chain of responsibility pattern is used to achieve loose-coupling in software design where a request from the client is passed to a chain of objects to process them. Then the object in the chain will decide who will be processing the request and whether the request is required to be sent to the next object in the chain or not.
    //
    //We know that we can have multiple catch blocks in a try-catch block code. Here every catch block is kind of a processor to process that particular exception. So when an exception occurs in the try block, it’s sent to the first catch block to process. If the catch block is not able to process it, it forwards the request to the next Object in the chain (i.e., the next catch block). If even the last catch block is not able to process it, the exception is thrown outside of the chain to the calling program.
    //
    //4. Observer Pattern
    //An observer design pattern is useful when you are interested in the state of an Object and want to get notified whenever there is any change. In the observer pattern, the Object that watches the state of another Object is called observer, and the Object that is being watched is called subject.
    //
    //Java provides an built-in platform for implementing the observer pattern through the java.util.Observable class and java.util.Observer interface. However, it’s not widely used because the implementation is limited and most of the time we don’t want to end up extending a class solely for implementing the observer pattern as Java doesn’t provide multiple inheritances in classes. Java Message Service (JMS) uses the observer pattern along with the mediator pattern to allow applications to subscribe and publish data to other applications.
    //
    //5. Strategy Pattern
    //Strategy pattern is used when we have multiple algorithms for a specific task, and the client decides the actual implementation be used at runtime. A strategy pattern is also known as a policy pattern. We define multiple algorithms and let client applications pass the algorithm to be used as a parameter.
    //
    //One of the best examples of this pattern is the Collections.sort() method that takes the Comparator parameter. Based on the different implementations of comparator interfaces, the objects are getting sorted in different ways.
    //
    //Public enum EncodingPattern{
    //	MD5,
    //	SHA1,
    //	SHA2
    //}
    //public interface Encryption{
    //	public void encrypt(String toBeEncypted);
    //	public EncodingPattern getEncryptionType();
    //}
    //public MD5Encryption implements Encryption{
    //	@Override
    //	public void encrypt(String str){
    //		System.out.println(str);
    //	}
    //
    //	@Override
    //	public EncodingPattern getEncryptionType(){
    //		return EncodingPattern.MD5;
    //	}
    //}
    //
    //public SHA1Encryption implements Encryption{
    //	@Override
    //	public void encrypt(String str){
    //		System.out.println(str);
    //	}
    //
    //	@Override
    //	public EncodingPattern getEncryptionType(){
    //		return EncodingPattern.SHA1;
    //	}
    //}
    //
    //@Service
    //public SHA2Encryption implements Encryption{
    //	@Override
    //	public void encrypt(String str){
    //		System.out.println(str);
    //	}
    //
    //	@Override
    //	public EncodingPattern getEncryptionType(){
    //		return EncodingPattern.SHA2;
    //	}
    //}
    //
    //@Component
    //public class EncryptionFactory{
    //	Map<EncodingPattern, Encryption> map;
    //
    //	@Autowired
    //	public EncryptionFactory(Set<Encryption> set){
    //		createStrategy(set);
    //	}
    //
    //	public void createStrategy(Set<Encryption> set){
    //		map = new HashMap<>();
    //		set.stream().forEach(encryptionType -> map.put(encryptionType.getEncryptionType(), encryptionTypes));
    //	}
    //
    //	public Encryption findEncryptionType(EncodingPattern ep){
    //		return map.get(ep);
    //	}
    //}
    //
    //@RestController
    //public class ControllerDemo{
    //	@Autowired
    //	EncryptionFactory factory;
    //
    //	@GetMapping("/encryption")
    //	public EncodingPattern getEncryptionType(){
    //		return EncodingPattern.MD5;
    //	}
    //	public void getEncryptionType(EncodingPattern ep){
    //		return factory.findEncryptionType(ep).encrypt("test");
    //	}
    //}
    //
    //
    //6. Command Pattern
    //The command pattern is used to implement loose-coupling in a request-response model. In this pattern, the request is sent to the invoker and the invoker passes it to the encapsulated command object. The command object passes the request to the appropriate method of receiver to perform the specific action.
    //
    //
    //7. State Pattern
    //The state design pattern is used when an Object changes its behavior based on its internal state. If we have to change the behavior of an Object based on its state, we can have a state variable in the Object and use if-else condition block to perform different actions based on the state. The state pattern is used to provide a systematic and loosely-coupled way to achieve this through context and state implementations.
    //
    //
    //8. Visitor Pattern
    //The visitor pattern is used when we have to perform an operation on a group of similar kinds of objects. With the help of a visitor pattern, we can move the operational logic from the objects to another class.
    //
    //
    //9. Interpreter Pattern
    //The interpreter pattern is used to define a grammatical representation of a language and provides an interpreter to deal with this grammar.
    //
    //
    //10. Iterator Pattern
    //The iterator pattern is one of the behavioral patterns and is used to provide a standard way to traverse through a group of objects. The iterator pattern is widely used in Java Collection Framework where the iterator interface provides methods for traversing through a Collection. This pattern is also used to provide different kinds of iterators based on our requirements. The iterator pattern hides the actual implementation of traversal through the Collection and client programs use iterator methods.
    //
    //
    //11. Memento Pattern
    //The memento design pattern is used when we want to save the state of an object so that we can restore it later on. This pattern is used to implement this in such a way that the saved state data of the object is not accessible outside of the Object, this protects the integrity of saved state data.
    //
    //Memento pattern is implemented with two Objects – originator and caretaker. The originator is the Object whose state needs to be saved and restored, and it uses an inner class to save the state of Object. The inner class is called “Memento”, and it’s private so that it can’t be accessed from other objects.
    //
    //
    //
    //
    //Miscellaneous Design Patterns
    //1. DAO Design Pattern
    //The Data Access Object (DAO) design pattern is used to decouple the data persistence logic to a separate layer. DAO is a very popular pattern when we design systems to work with databases. The idea is to keep the service layer separate from the data access layer. This way we implement the separation of logic in our application.
    //
    //2. Dependency Injection Pattern
    //The dependency injection pattern allows us to remove the hard-coded dependencies and make our application loosely-coupled, extendable, and maintainable. We can implement dependency injection in Java to move the dependency resolution from compile-time to runtime. Spring framework is built on the principle of dependency injection.
    //
    //3. MVC Pattern
    //Model-View-Controller (MVC) Pattern is one of the oldest architectural patterns for creating web applications.
    //
    //
    //
    //
    //
    //------------
    //
    //https://www.aspecto.io/blog/easy-way-to-route-traffic-between-microservices-during-development/
    //
    //https://medium.com/@dalibor.plavcic/jvm-internals-for-the-java-job-interview-83257d038134
    //
    //https://livebook.manning.com/book/spring-microservices-in-action/chapter-6/27
    //
    //https://www.aspecto.io/blog/easy-way-to-route-traffic-between-microservices-during-development/
    //
    //
    //
    //
    //Collection Hierarchy
    //						Collection ->root interface
    //						|													extends
    //			_________________________________________________				------> Map
    //			|			extends |					extends	|				|		|
    //			List			-->	Queue				---->	Set				|		|
    //			|				|	|					|		|				|		HashMap
    //			ArrayList		|	PriorityQueue		|		HashSet			|		|
    //			|				|						|		|				|		HashTable
    //			|			Dequeue					SortedSet	LinkedHashSet	|
    //			|				|						|						SportedMap
    //			|			ArrayDequeue				|						|
    //			LinkedList							TreeSet						|
    //extends		|																TreeMap
    //-------->Vector
    //|
    //|
    //Stack
    //
    //Map : key value pair, unique key, dup values, n null value. 1 null key. internally uses linkedlist and arrays.
    //non synchronized
    //
    //HashTable : synchronized, no null key and no null values
    //SortedMap : ascending order
    //TreeMap : implicitly implement red-black tree implementation, can not store null key
    //
    //List: contain duplicates
    //ordered element
    //support index based search random access but element can easily inserted irrespective of the position.
    //
    //ArrayList: dynamic resizing 50% of original size.
    //non synchronized
    //internally uses array
    //
    //LinkedList : implement list & dequeu interface
    //maintain insertion order
    //non synchronized
    //doesn't support accessing elements randomly
    //can use ListIterator to iterator  linkedlist elements
    //
    //Set: doesnt define an order for the element hence index based searching is not supported
    //doesn't contain duplicates.
    //1 null value only.
    //
    //HashSet : it implicit implements Hashtable.
    //only unique elements
    //no order (unordered)
    //only one null element
    //
    //LinkedHashSet : ordered version of hashset which maintains a doubly linked list across all element
    //it preserve the insertion order
    //
    //SortedSet : must implement comparable interface(Ascending order)
    //
    //TreeSet : uses a tree for storage(red-black tree)
    //objects in a treeset are sorted in ascending order
    //
    //Queue : Fifo
    //element adds at rear and removed from the front end.
    //
    //PriorityQueue : it is a queue with priority associated with each element.
    //high priority element is served before a low priority element irrespective of their insertion
    //
    //Dequeue : double ended queue
    //ArrayDequeue : way to apply resizable array in addition to the implementation of the deque interfaec.
    //no capacity restriction.
    //
    //
    //Why map doesn't extends the collection interface
    //Map : key value pair
    //Collection : collection of objets which are stored in structured manner with specified mechanism.
    //add(E e) doesn't support the key value pair like Map's interfaec's put(K k,V v)
    //
    //
    //Diff. b/w synchronized collection & concurrent collection.
    //- both provide thread safety
    //- diff comes in performance, scalability, & how they achieve thread safety- synchronized collction like synchronized hashmap are much slower than their concurrent counterparts.
    //eg: ConcurrentHashMap, main reason for this slowness is locking.
    //
    //Synchronized collection uses intrinsic locking and the entire collection are locked.
    //concurrent collection achieve thread safety by diving their data into segments. for exam: diff threads can acquire lock on each segments so multiple thread can access the Map at the same time.
    //Concurrent collections are much more performant than synchronized collections, due to the inherent advantages of concurrent thread access.
    //
    //
    //Fail Fast and Fail Safe Iterator?
    //Fail Fast : throws ConcurrentModificationException where one thread is iterating over colletions and other thread structurally modify collection either by adding= or updating object underlying collections.
    //fail false as immediately throw error.
    //
    //Fail Safe : does not throw error if collection is modified structurally while one thread is iterating over it because they work on clone of collection instead of original collection.
    //
    //
    //BlockingQueue
    //it is thread safe to put element into & takes out of from.
    //or multiple thread can be inserting & taking element concurrently from a BlockingQueue without any concurrency issue arising. it does not enqueue null values, if we try to do it will throw NPE bug.
    //bounded/unbounded
    //it will be block on bounded until consumer starts consuming.
    //
    //
    //---------
    //Serialization and Deserialization
    //Serialization : is a process of converting the state of object into bytestream and then send it over the network to either save it in file/ in db.
    //Deserialization : is the reverse process of serialization, where it's convert the bytestream object to actual java object.
    //bytestream creation is platform independent so if you serialized in one platform, you can deserialized in diff platform.
    //to make serialize, implement java.io.Serializable interface.
    //there is one class, ObjectOutputStream, this class contains writeObject() for Serializable.
    //public final void writeObject(Object ob) throws IOException
    //readObject() method of ObjectInputStream class is used for deserializing the data.
    //public final void readObject(Object ob) throws IOException, ClassNotFoundException
    //
    //SerialVersionUID : at runtime, the serialization associates a version number to each seriazable class is called version id. which is used during Deserializationto verify the sender and receiver of a serialized object have loaded classes for that object which are compatible with respect to serialization.
    //if the receiver has loaded a class for that object that has diff UID than that of corresponding sender's class, the deserialization will result in an InvalidClassException.
    //
    //1. If a parent class has implemented Serializable interface then child class doesn’t need to implement it but vice-versa is not true.
    //2. Only non-static data members are saved via Serialization process.
    //3. Static data members and transient data members are not saved via Serialization process. So, if you don’t want to save value of a non-static data member then make it transient.
    //4. Constructor of object is never called when an object is deserialized.
    //
    //
    //-------
    //
    //Static Binding vs Dynamic Binding
    //static binding : static binding also k/wn as early binding. In static binding, the method call is resolved at compile time, which means the method to be executed determined at the time of compilation. this binding is performed based on the type of the reference variable, rather than the obj it refers to.
    //pros:
    //- as it resolved at compile  time it is faster.
    //- it is less prone to errors as during compilation, compiler checks for any error in the methods and its implementation.
    //
    //dynamic binding : dynamic binding allows us to write code that works with a generic reference type(in below case, it's Shape) but a runtime, the correct method implementation is determined based on the actual obj type being refered to. this flexibility & polyomrphic behaviour is one of the key advantage of dynamic binding in java.
    //pros:
    //- it is more flexibile as we can change the obj at runtime.
    //- it allows for polymorphism, which means the same method can behave differently depending on the obj type.
    //
    //class Shape{
    //  void draw(){
    //      System.out.println("Drawing Shape");
    //  }
    //}
    //class Rectangle extends Shape{
    //  void draw(){
    //      System.out.println("Drawing Rectangle");
    //  }
    //  void print(){
    //      System.out.println("Printing Rectangle");
    //  }
    //}
    //class Test{
    //  public static void main(String[] args){
    //      Shape s1 = new Shape(); // dynamic binding
    //      Shape s2 = new Rectangle(); // dynamic binding
    //      Rectangle r = new Rectangle(); // static binding
    //      s1.draw();
    //      s2.draw();
    //      r.print();
    //  }
    //}
    //
    //diff b/w these two:
    //Parameter					Static Binding				Dynamic Binding
    //time of binding				Occurs at compile time		Occurs at run time
    //Method Resolution			 Method is executed based 	Method is executed
    //														based on the actual type of the object that the reference variables refer to.
    //							 on the type of reference
    //							 variable used to call the
    //							 method
    //
    //Overloading & Overriding 	it is used for method 		it is used for method
    //							overloading					overriding
    //
    //
    //Flexibility					it is less flexible than	it is more flexible
    //							dynamic binding				than static binding
    //
    //Performance					it is faster than dynamic 	it is slower than
    //							 binding					static binding
    //
    //-------
    //
    //https://medium.com/@basecs101/do-you-know-autoboxing-and-unboxing-in-java-latest-updated-2023-5544bcb42c1b
    //
    //Autoboxing and Unboxing
    //Autoboxing is the automatic conversion that the java compiler makes b/w the primitive types and their corresponding obj wrapper classes.
    //For example : a int to Integer coversion,
    //a double to Double so on so forth.
    //
    //Unboxing :  converting an obj of wrapper type to its corresponding primitive type.
    //
    //example :
    //public class Main{
    //	public static void main(String[] args){
    //		Integer i = new Integer(10);
    //		//unboxing the obj
    //		int i1 = i;
    //
    //		sopln(i);
    //		sopln(i1);
    //
    //		// autoboxing of character
    //		Character ch = 'a';
    //		//auto unboxing of character a
    //		char ch1 = ch;
    //
    //		sop(ch);
    //		sop(ch1);
    //	}
    //}
    //
    //
    //autoboxing exam :
    //List<Integer> list = new ArrayList<>();
    //list.add(1); // autoboxing
    //list.add(2); // autoboxing
    //
    //for(int i=0; i<10; i++){
    //	sop(list.add(Integer.valueOf(i)));//
    //}
    //
    //
    //class BoxingTest{
    //	public void printUnboxing(int i){
    //		sop("printing the unboxed value "+i);
    //	}
    //
    //	public void printAutoboxing(Integer i){
    //		sop("printing the autoboxing value " +i);
    //	}
    //}
    //class Test{
    //	psvm(){
    //		BoxingTest obj = new BoxingTest();
    //		int i=5;
    //		obj.printUnboxing(i);
    //		Integer m = i;
    //		obj.printAutoboxing(i);
    //	}
    //}
    //
    //------------
    //Covariant return type
    //when we override method- what allows the return type to be the subtype of the type of the overriden method.
    //
    //The covariant return types specifies that the return type may vary in the same direction as the subclass.
    //public Base{
    //	public Object test(){return new Object;}
    //}
    //public SubClass{
    //	public String test(){return "";}
    //}
    //
    //in above scenario, subclass has return type changes and it is returning String. but String is subtype of Object class. hence it's doable.
    //
    //public Base{
    //	public Integer test(){return 0;}
    //}
    //public SubClass{
    //	public String test(){return "";} // it will say override test method
    //}
    //
    //---------
    //
    //Collection vs Stream
    //Collection : Collection is in memory data structure, which holds all the values that the data structure currently has. Every element in the collection has to be computed before we did it to the collection.
    //Operation such as searching, sorting, insertion, manipulation and deletion can be performed on a collection. it provides many interfaes, like set, map, queue, list etc.
    // and classes like arraylist, vector, linkedlist, hashset, priorityqueue
    //
    //Stream is an api that is introduces in java8, which is used to process collections of object. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
    //the Stream API is used to process collections of objects.
    //- it's not a dsa but it takes i/p from collections, arrays or I/O channels.
    //- Streams dont change the original data structure, they only provide the result as per the pipelined methods.
    //- Each intermediate operation is lazily executed and returns another stream as a result, hence various intermediate operations can be pipelined. terminal operations mark the end of the stream and return the result.
    //- java streams are consumable, that means to traverse the stream, it needs to be created everytime.
    //- streams are not modifiable that is one can't add or remove elements from streams.
    //- streams are iterated internally by just mentioning the operations.
    //
    //---------
    //
    //
    //Collection in Java is a framework that provides interfaces and classes to store and manipulate groups of objects.
    //
    //Collections can be used to store objects of any type.
    //
    //Some common collection types include ArrayList, LinkedList, HashSet, and TreeMap.
    //
    //Collections can be sorted, searched, and filtered using various methods.
    //
    //Iterators can be used to traverse through collections and perform operations on each element.
    //
    //Collections can also be used in conjunction with streams to perform functional-style operations on the elements.
    //
    //---------
    //Rest API
    //
    //@RequestParam : fetch the URL parameter and map it to the method argument.
    //@PathVariable : map the URI variable to one of the method arguments.
    //@RequestBody : this maps the HttpRequest Body to a transfer or domain object, enabling automatic deserialization of inbound HttpRequest body onto a java object.
    //the type we annotate with the @RequestBody annotation must correspond to the JSON sent from out client side controller.
    //
    //@ResponseBody : this annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse Object.
    //
    //@PostMapping(value="/content", produces = MediaType.APPLICATION_JSON_VALUE)
    //@PostMapping
    //@GetMapping
    //@PutMapping
    //@DeleteMapping
    //
    //Idempotent Methods: idempotent methods are k/wn to return the same outcome even after the same request has been made multiple times, and it avoids errors caused by duplicate requests on the client side.
    //
    //max size of payload : no such max limit for payload size that can be sent in post methods, however, payloads with larger sizes can consume larger bandwidth. thus the server could take more time to proceed with the request.
    //
    //Diff b/w post and Put
    //Post method :
    //can create a resource on the server.
    //not idempotent
    //responses are cacheable
    //
    //Put methods
    //used to replace a resource at a specific URI with another resource.
    //idempotent that it will only result in one resource even after calling it multiple times.
    //put responses are not cacheable.
    //
    //
    //Http Status?
    //200 Ok
    //201 Created
    //400 Bad Request
    //401 Unauthorized
    //403 Forbidden
    //404 Not foound
    //500 Internal server error
    //502 Bad Gateway
    //503 Service Unavailable
    //
    //
    //URI : Uniform Resource Identifier.
    //
    //what is caching in Rest API
    //REST api stores a copy of server response in a particular location of computer memory to retrieve the server response fast in the future. This method is temporary and called caching.
    //
    //what is diff b/w REST and SAOP?
    //REST (Repesentation State Transfer)
    //- it is architectural design pattern used to develop web services.
    //- it is faster in speed and more cacheable.
    //- it inherits only the security measures concerning the protocol that have been implemented.
    //
    //
    //SAOP (Simple Object Access Protocol)
    //- it is a strict protocol used to build secure APIs
    //- it is slower in speed and not cacheable
    //- it is able to define its own security measures.
    //
    //what do you understand about JAX-RS
    //its a java based specification implemented for RESTful services and defined by JEE.
    //
    //Disadvantange of RESTful web services?
    //- RESTful web services are stateless and do not maintain session simulation responsibliity as the client side does not provide a particular session id for it.
    //- REST is not able to impost the security restriction inherently. However, it inherits them with the help of implementing protocols. Thus, the integration of SSL/TLS authentication needs to be done very carefully for better security measures of the REST apis.
    //
    //
    //
    //
    //--------
    //
    //
    //https://konstantinmb.medium.com/the-basics-of-service-to-service-communication-a-beginners-guide-79a2bba0a386
    //
    //
    //shed lock and ..
    //
    //https://medium.com/@pinkijindal786/distributed-lock-for-scheduled-tasks-shedlock-using-springboot-27838c7aace9
    //-------
    //
    //Asynchronous : is non blocking architecture. so the execution of one task isn't dependent on another. Task can run simultaneously.
    //Synchronous : is a blocking architecture, so the execution of each operation depends on completing the one before it.
    //----
    //
    //scope:
    //single bean -> inside this singleton bean, we have prototype bean scope. now spring will take it as singleton bean only but if we want to have prototype bean then we would be using lookup annotation.
    //
    //----------
    //https://www.freecodecamp.org/news/the-apache-cassandra-beginner-tutorial/
    //
    //
    //In Cassandra:
    //
    //The Partition Key is responsible for data distribution across your nodes.
    //The Clustering Key is responsible for data sorting within the partition.
    //The Primary Key is equivalent to the Partition Key in a single-field-key table (i.e. Simple).
    //The Composite/Compound Key is just any multiple-column key
    //
    //primary key  -> consists of 1or n partition keys and 0or more clustering key components.
    //A partition key is for data placement apart from uniquely identifying the data and is always the first value in the primary key definition.
    //The primary goal of a partition key is to distribute the data evenly across a cluster and query the data efficiently.
    //
    //Composit Partition Key -> If we need to combine more than one column value to form a single partition key, we use a composite partition key.
    //Here again, the goal of the composite partition key is for the data placement, in addition to uniquely identifying the data. As a result, the storage and retrieval of data become efficient.
    //Most importantly, to efficiently retrieve data, the where clause in fetch query must contain all the composite partition keys in the same order as specified in the primary key definition:
    //
    //Clustering Key :
    //partitioning is the process of identifying the partition range within a node the data is placed into. In contrast, clustering is a storage engine process of sorting the data within a partition and is based on the columns defined as the clustering keys.
    //
    //
    //Txn management in hibernate :
    //Atomicity : the entire txn takes place at once or doesn't happen at all.
    //Consistency : the database must be consitent before and after the txn.
    //Isolation : Multiple txn occurs indenpendently without interference.
    //Durability : the change of a successful txn occurs even if the systems failure occurs.
    //@Transactional : @RollBack, readonly, timeout, isolation, propagation
    //propagation : how txn is managed one method internally it called another method which is also annotated with @Transactional
    //
    //
    //Atomicity : all or nothing principal.
    //Consistency : txn takes a system from one consistent state to another consistent state.
    //Isolation : txn are not visible to any other txn until you commit.
    //Durability : your commited changes get persisted
    //
    //ServiceMash : talks to POD in kubernetes
    //
    //
    //Cassandra Architecture :
    //It's nosql db, and provided by apache.
    //it's used in read and write operations at the planet scale.
    //how it does perform read and write operations?
    //gossip
    //failure detection snitches
    //Rings and tokens
    //Coordinator node
    //read & write operation basic.
    //
    //
    //Gossip detection protocols are used by distributed system to identify the health of the various nodes as we know that cassandra has a number of nodes which are used for read & write operations.
    //There is a gossiper node which tries to connect with all the nodes & try keep a track of the health of each and every node.
    //how does the gossiper works ?
    //so gossips detection protocol works something like this so there is a node which stores the data and there will be a gossiper node. so gossiper node will keep on pinging the node in the regular intervals with a gossip digesting message and if this node is healthy it will revert with to the gossiper with a gossip digest acknowledgement message so this mean this node is healthy and is able to revert to the gossip. and if the gossiper has received this gossip digest acknowledgement message it will revert to the node with a godzip digest acknowledgement2 which means that the gossiper has recorded this node as a healthy node. this a scenario that how a  healthy node responds to a gossiper.
    //
    //			GossipDigestSync
    //Gossiper ----------------------> Node
    //Gossiper <---------------------- Node
    //			GossipDigestAck
    //
    //Gossiper ----------------------> Node
    //			GossipDigestAck2
    //
    //
    //
    //Scenario where node is unhealthy:
    //Gossiper will ping the node with a gossip digesting from this message and in this scenario the node will not be able to revert with a gossip digest acknowledgement message. so if the gossiper does not receive this message then gossiper will assume that this node is going to be unhealthy so there comes a very imp algorithm here which is k/wn as free acura failure detection algorithm so this algorithm detects that the gossiper and the node must be separate entity so the thing that has to be monitored will be different from the thing that is monitoring things.
    //and the other thing is the response of the gossiper will not be a boolean it will be a number which tells the suspicion level of the gossiper. so if this node is not able to respond to the gossiper. the gossiper will suspect that this node is about unhealthy but it will not mark it unhealthy immediately bcz there can be lag at the network layer as well so what will the gossiper do,
    //the gossiper will increase the suspicion level of the node thus this node might be unhealthy but if this node continues to fail to respond to the gossiper messages then this gossiper will increase keep on increasing the suspicion level and will ultimately mark this node as an unhealthy node.
    //
    //decoupling from application to be monitored
    //suspicion level
    //phi Accural Failure detector algorithm
    //
    //
    //Snitches.
    //cassandra is distributed system which is having a lot of moving parts a lot of nodes in it. so snitches help to identify that which of the nodes provide the minimum latency for read and write operations.
    //there are many types of snitches but we are generally focused on two types of snitches.
    //1. simple snitches: simple snitches identifies the node in a single data center for example in a single data center which of the racks are have providing the minimum latency for the read and write operations.
    //
    //2. dynamic snitching : as we have earlier discussed the gossiper keep on tracking the health of various node. it keeps on tracks the latency of the various nodes the dynamic snitch uses that data to identify which of the nodes will provide the minimum latency for read & write operations. so the gossiper protocol provides the failure detection as well as it contributes to the dynamic snitching and that dynamic snitching is used for making database faster by identifying the nodes which will provide the data with the minimum latency.
    //
    //
    //Snitch : help to find the replicas which will provide the least latency while fetching the data
    //
    //
    //Rings and Token
    //Cassandra has a architecture where it distribute is to the various nodes so what is basically does it?
    //it makes the hash of the primary key and depending upon the hash of the primary key it distribute those primary keys to the various nodes and the partioner uses consistent hashing to identify the nodes on which the read & write operations are to be done, so we are going to provide this node with the responsibility of keys from 1 to 100 and this node from 1 to 200. so this interval all this range for which the node is responsible for read & write operation is k/wn as the token range of the node so this node can participate in all the read & write operation for particular key, if the key is less than 100 it is very participated and if key arises in this range(1-200) this node is going to be participated in read & write operations.
    //
    //
    //Coordinator Node :  it plays very imp role in cassandra so suppose you are going to make a read & write operations to a db so you will choose any node in the cassandra db so suppose this is the coordinator node, now this coordinator node is going to take the hash of the primary key after taking the hash of the primary key. let's say the value of hash is 50. so let's assume that this node is having the responsbility of handling the keys from 1 to 100. this coordinator node will request this node to perform the write operation and apart from that it will ask few other nodes to keep a track of that data so that we can have distributed network or we can have multiple nodes for the write operations so in case this node is going to fail we doesn't loose data. so thats about the coordinator.
    //
    //what will happen when we are going to perform read & write operations to the cassandra.
    //let's start with write operations, so suppose we are going to write a value of a equal to 10 in cassandra db, so the all request will go to the coordinator node, coordinator node is going to take the hash of the key and lets suppose the hash value of key is 50, so the coordinator node is going to send a request to the node that is dealing with that partition range of that token range and this node, and ask this node to save the value of a is equal to 50. apart from that it will also ask you other nodes to provide to keep a track of this record and what node it has to reach out that it becomes the part of the snitching algorithm. the nodes which provide the minimum latency for the read & write operations.
    //so in this way we are going to perform out write operations in db.
    //now have a look on read operations :
    //now we would be reading the value of key a so the request will go to the coordinator node, and coordinator node will do the hash of the key and will come up with a hash, and from the hash value it will identify which node will is going to contain that information so suppose this node is containing that information so the coordinator nodes is going to make a request to this node for that particular value. a nd apart from that it will also going to make a request to few others node for the values of this game. now assume that two of the its node responded with value of a = 10, and now other node is responding with a=5. so in this case the coordinator node will revert the client with the value of a =10 and is going to ask this node to update its value from a =5 to 10.
    //such type of mechanism is k/wn as reader pair where the coordinator node is trying to reach out to various node, read their values and identify that one which of the node are having outdated value and explicitly ask them to update their values.
    //Now assume a scenario where we are going to write up a value on a particular node so the request has gone to this node and this node and this node, and assume some scenario where this node is not available at that moment. and the write opertaion on this node is dropped so what the coordinator node will keep a track of this record so it will keep that the value of a=10 and has to be updated on this node and this mechanism is k/wn as the hinted handoff. the sender db also provides the functionality of tunable consistency which means the number of nodes we want to write and the number of nodes we want to read from. that can be tunes in case of cassandra db to make the trade off b/w the consistency and availability.
    //for now let's deep dive into what happens then this particular node is asked to write up a particular value for example a =10. so the cassandra db is based on the LSM treee based architecture. to conclude on top level we can say that in cassandra there is a coordinator node which has the responsibility for performing all the read & write opertaions the coordinator node uses snitches for identifying the nodes with the minimum latency. the coordinator node is going to create a hash and will identifying the node that is possible for that token rang, it will make a request to the node handling that tokken range and that node is going to write all the data in lsm tree based architecture.
    //
    //
    //
    //
    //
    //
    //------------
    //
    //https://www.aspecto.io/blog/easy-way-to-route-traffic-between-microservices-during-development/
    //
    //https://medium.com/@dalibor.plavcic/jvm-internals-for-the-java-job-interview-83257d038134
    //
    //https://livebook.manning.com/book/spring-microservices-in-action/chapter-6/27
    //
    //https://www.aspecto.io/blog/easy-way-to-route-traffic-between-microservices-during-development/


    //In Cassandra:
    //
    //The Partition Key is responsible for data distribution across your nodes.
    //The Clustering Key is responsible for data sorting within the partition.
    //The Primary Key is equivalent to the Partition Key in a single-field-key table (i.e. Simple).
    //The Composite/Compound Key is just any multiple-column key
    //
    //primary key  -> consists of 1or n partition keys and 0or more clustering key components.
    //A partition key is for data placement apart from uniquely identifying the data and is always the first value in the primary key definition.
    //The primary goal of a partition key is to distribute the data evenly across a cluster and query the data efficiently.
    //
    //Composit Partition Key -> If we need to combine more than one column value to form a single partition key, we use a composite partition key.
    //Here again, the goal of the composite partition key is for the data placement, in addition to uniquely identifying the data. As a result, the storage and retrieval of data become efficient.
    //Most importantly, to efficiently retrieve data, the where clause in fetch query must contain all the composite partition keys in the same order as specified in the primary key definition:
    //
    //Clustering Key :
    //partitioning is the process of identifying the partition range within a node the data is placed into. In contrast, clustering is a storage engine process of sorting the data within a partition and is based on the columns defined as the clustering keys.
    //
    //
    //Txn management in hibernate :
    //Atomicity : the entire txn takes place at once or doesn't happen at all.
    //Consistency : the database must be consitent before and after the txn.
    //Isolation : Multiple txn occurs indenpendently without interference.
    //Durability : the change of a successful txn occurs even if the systems failure occurs.
    //@Transactional : @RollBack, readonly, timeout, isolation, propagation
    //propagation : how txn is managed one method internally it called another method which is also annotated with @Transactional
    //
    //
    //Atomicity : all or nothing principal.
    //Consistency : txn takes a system from one consistent state to another consistent state.
    //Isolation : txn are not visible to any other txn until you commit.
    //Durability : your commited changes get persisted
    //
    //ServiceMash : talks to POD in kubernetes


    //Index types :
    //Regular Index :
    //Primary Key :
    //FULLTEXT index:
    //you can achieve fast searches with the help of an index.
    //Indexes speed up performance by either ordering the data on disk so it's quicker to find your result or, telling the SQL engine where to go to find your data.
    //
    //
    //SHOW DATABASES;
    //
    //a view consists of a set of rows that is returned if a perticular query is executed. This is also k/wns as a virtual table.
    //view make it easy to retrieve the way of making the query available via an alias.
    //advatanges: simplicity, security, maintainability.
    //
    //A database object that has no value is called view. Rows and Cols exist in a view. A view is virtual table. it is created by combining one or more tables. the diff of a view and a table is that views are definition that build on other tables. if the underlying table changes, the view will also reflect those same changes.
    //
    //Create view view_name as select columns from table where conditions;
    //
    //
    //Triggers ?
    //a trigger is a task that executes in response to some predefined database event, such as after a new row is added to a particular table. Specifically, this event involves inserting, modifying or deleting table data, and the task can occur either prior to immediately following any such event.
    //triggers have many purposes, including:
    //auditing trails
    //validation
    //referential integrity enforcement
    //
    //
    //there are 6 triggers in mysql
    //before insert
    //after insert
    //before update
    //after update
    //before delete
    //after delete
    //
    //
    //A trigger is a procedural code in a database. Triggers are automatically triggered when specific events occur on a particular table. During column updating triggers are invoked automatically.
    //
    //
    //mysqldump : a tool for backing up your databases or copying databases to another server.
    //
    //
    //
    //Normalization : is used to avoid duplication and redundancy. it is a process of organizing data. There are many normal forms of normalization. which are also called successive levels. The first 3 regular forms are sufficient.
    //1NF
    //2NF
    //3NF


    //public static int secLar(int[] arr)
    //    {//4,7,1,3,9,2,-3,-10};
    //        int largest = Integer.MIN_VALUE; // 0
    //        int secondLar = Integer.MIN_VALUE; // 0
    //        for(int i=0;i<arr.length;i++){
    //            if(arr[i] > largest){ // 1 > 7//
    //                secondLar = largest; // 0 // 4
    //                largest = arr[i]; //  4 // 7
    //            } else if(arr[i] > secondLar && arr[i] != largest){// 1>4 && 1!=7
    //                secondLar = arr[i]; // 1
    //            }
    //        }
    //
    //        return secondLar;
    //    }
    //
    //


    //JAVA 8 Features
    //1. forEach method in iterable interface
    //2. default and static methods in interface
    //3. functional interface and method reference
    //4. Java stream APi for bulk operations on collections.
    //5. Java time api
    //6. collections api improvements.
    //7. concurrency api improvements.
    //8. JAVA IO improvements
    //
    //
    //1. forEach methods : whenever we need to traverse through a collections, we need to create a iterator whose whole purpose is to iterate over, and then we have business logic in loop for each of element in the collection. we might get ConcurrentModificationException if the iterator is not used correctly.
    //in java8, they introduced forEach method that takes Consumer object as an arguments, so it helps in having our business logic at separate location that we can reuse.
    //class Main{
    //	List<Integer> list = new ArrayList<Integer>();
    //	for(int i=0; i<10; i++)
    //		list.add(i);
    //
    //	Iterator<Integer> it = list.iterator();
    //	while(it.hasNext()){
    //		Integer i = it.next();
    //		sop("Value : "+i);
    //	}
    //
    //	list.forEach(new Consumer<Integer>(){
    //		public void accept(Integer t){
    //			sop("forEach Annonymous class value "+t);
    //		}
    //	});
    //
    //	//traversing with consumer interface implementation
    //	MyConsumer action = new MyConsumer();
    //	list.forEach(action);
    //}
    //
    //class MyConsumer implements Consumer<Integer>{
    //	public void accept(Integer it){
    //		sop("Consumer impl value "+it);
    //	}
    //}
    //
    //
    //
    //2. Default and static methods in interface
    //if you read forEach method details carefully, you will notice that it's defined in iterable interface but we know that interface can't have a method body. from java8, interfaces are enhanced to have a method with implementation. we can use default and static keyword to create interfaces with method implementation.
    //forEach method implementation in iterable interface is:
    //default void forEach(Consumer<? super T> action){
    //	Objects.requireNonNull(action);
    //	for(T t: this){
    //		action.accept(t);
    //	}
    //}
    //
    //
    //3. Functional Interface or Lambda Expression :
    //Functional interface are new concept introduced in java8. An interface with exactly one abstract method becomes a functional interface.
    //@FunctionalInterface annotation is a facility to avoid the accidental addition of abstract methods in the functional interfaces. You can think of it like @Override annotation and it's best practice to use it.
    //java.lang.Runnable with a single abstract method run() is a great example of a functional interface.
    //One of the major benefits of the functional interface is the posibility to use lambda expressions to instantiate them. we can instantiate an interface with an annonymous class but the code looks bulky.
    //Runnable r = new Runnable(){
    //	@Override
    //	public void run(){
    //		sop("print");
    //	}
    //};
    //
    //Since functional interfaces have only one method, lambda expression can easily provide the method implementation. we just need to provide method arguments and business logic.
    //Runnable r1 = ()->{sop("print");};
    //
    //if you have single statement in method implementation, we dont need curly braces also.
    //so lambda expressions are a means to create anonymous classes of functional interfaces easily. there are no runtie benefits of using lambda expression. so I will use it cautiously bcz I dont mind writing a few extra lines of code.
    //
    //Method Reference :
    //Reference to static method.
    //ClassName::methodName
    //
    //Reference to an instance method
    //obj::methodName
    //
    //Reference to an instance method of an Arbitrary object of a particular type.
    //Integer.compareTo
    //
    //Reference to a constructor
    //ClassName::new
    //
    //4. Java stream api for bulk operations
    //stream has been added in java8 to perform filter/map/reduce like operations with the collection. Stream api will allow sequential as well as parallel execution.
    //this is one of the best feature for me bcz i work a lot with collections. we need to filter out them based on some conditions.
    //collection iterface has been extended with stream() and parallelstream() default methods to get the stream for sequential and parallel execution.
    //
    //5. Java time api
    //it has always been hard to work with Date, time and time zones in java. There was no standard approach or api in java for data and tie in java. One of the nice addition in java8 is the java.time package that will streamline the process of working with time in java.
    //
    //6. Collection API improvements
    //Iterator default method forEachRemaining(Consumer action) to perform the given action for each remaining element until all elements have been processed or the action throws an exception.
    //Collection default method removeIf(Predicate filter) : to remove all of the elements of this collection that satisfy the given predicate.
    //Map replaceAll(), compute(), merge() methods. getOrDefault(), comparingByKey() and comparingByValue().
    //performance improvement for Hashmap class with key collisions.
    //the Comparator interface has been extended with a lot of default and static methods for natural ordering, reverse order etc.
    //min(), max() and sum() methods in integer, long and double wrapper classes.

    //Input: nums = [1,1,1,2,2,3]
    //Output: 5, nums = [1,1,2,2,3,_]
    //
    //
    //[1,1,1,2,2,3]
    //
    //
    //
    //k=2;
    //for(int i=2;i<=nums.length; i++){
    //	if(nums[i] == nums[i-1] ) {
    //		if(nums[i] != nums[i-2]){
    //			 nums[k++] = nums[i];
    //		}
    //	} else {
    //		nums[k++] = nums[i];
    //	}
    //}
    //
    //
    //int num = 39;
    //3*9=27
    //2*7 = 14
    //1*4 = 4
    //
    //123
    //1*2*3 = 6
    //
    //
    //
    //
    //
    //
    //
    //
    //s1 = "Hello"
    //s2 = "Hello";


    //
    //@Autowired
    //private Test(Address address){
    //	this.address = address;
    //}
    //
    //@Autowired
    //public void setAddress(Address address){
    //	this.address = address;
    //}
    //
    //HashMap<Integer, String> map
    //
    //map.put(1,"A");
    //map.put(1,"B");
    //
    //SOP(map.get(1));
    //
    //
    //Employee
    //String name
    //String id;
    //double salary;
    //
    //List<Employee> list = ne ArrayList<>();
    //list.add(new Employee("01","Rajshree"));
    //list.add(new Employee("02","Shree"));
    //list.add(new Employee("03","ABC"));
    //list.add(new Employee("01","TEST"));
    //
    //>10k
    //desc
    //
    //list.stream().filter(e-> e.getSalary()>10000)
    //.sorted(Comparator.comparingDouble(Employee::getSalary))
    //.distinct()
    //.forEach(e-> System.out.println(e));
    //
    //hasmpa id, employee
    //multiple employees having same id, first employee should get stored
    //Map<String, Employee> map = new HashMap<>();
    //list.stream().filter(e-> {
    //	if(!map.containsKey(e.getId())){
    //		map.put(e.getId(), e);
    //	}
    //}).collect(Collectors.toMap());
    //
    //
    //
    //arr1 = ["aa","bb","cc","dd"]
    //arr2 = ["bb", "cc" ,"ee"]
    //["bb","cc"]
    //
    //
    //for(int i=0; i<n; i++){
    //	for(int j=0; j<m;j++){
    //		if(arr1[i]==arr2[j]){
    //			System.out.println(arr[1]);
    //		}
    //	}
    //}
    //
    //  String[] arr1 = {"aa","bb","cc","dd"};
    //    String[] arr2 = {"bb", "cc" ,"ee"};
    //// ["bb","cc"]
    //    int n = arr1.length;
    //    int m = arr2.length;
    //   for(int i=0; i<n; i++){ //i=1//bb
    //        for(int j=0; j<m;j++){  //j=0//bb
    //          if(arr1[i]==arr2[j]){ //bb==bb
    //            System.out.println(arr2[j]);
    //          }
    //        }
    //    }
    //
    //
    //
    //box = 50 balls
    //each balls having 1number in range of 1-50
    //pick one ball, identify which number
    //
    //int[] box = new int[50];



    //list 1 = [11, 11, 12, 13,14]
    //list 2 = [11,12, 15];
    //
    //o/p: 11, 11, 12
    //
    //Set<Integer> set = list1.stream().collect(Collectors.toSet());
    //
    //list2.stream().filter(e-> set.contains(e)).forEach(System.out::print);


    //public int maxPoints(int[][] points) {
    //        if (points.length <= 2) {
    //            return points.length;
    //        }
    //
    //        int maxPoints = 0;
    //
    //        for (int i = 0; i < points.length; i++) {
    //            Map<String, Integer> slopeCount = new HashMap<>();
    //
    //            int samePointCount = 0;
    //            int verticalLineCount = 0;
    //
    //            for (int j = 0; j < points.length; j++) {
    //                if (i == j) {
    //                    continue;
    //                }
    //
    //                int x1 = points[i][0];
    //                int y1 = points[i][1];
    //                int x2 = points[j][0];
    //                int y2 = points[j][1];
    //
    //                int dx = x2 - x1;
    //                int dy = y2 - y1;
    //
    //                if (dx == 0) {
    //                    if (dy == 0) {
    //                        samePointCount++;
    //                    } else {
    //                        verticalLineCount++;
    //                    }
    //                    continue;
    //                }
    //
    //                String slope = calculateSlope(dx, dy);
    //
    //                slopeCount.put(slope, slopeCount.getOrDefault(slope, 0) + 1);
    //            }
    //
    //            for (int count : slopeCount.values()) {
    //                maxPoints = Math.max(maxPoints, count + samePointCount);
    //            }
    //            maxPoints = Math.max(maxPoints, verticalLineCount + samePointCount + 1);
    //        }
    //
    //        return maxPoints;
    //    }
    //
    //    private String calculateSlope(int dx, int dy) {
    //        int gcd = gcd(dx, dy);
    //        return (dy / gcd) + "/" + (dx / gcd);
    //    }
    //
    //    private int gcd(int a, int b) {
    //        while (b != 0) {
    //            int temp = b;
    //            b = a % b;
    //            a = temp;
    //        }
    //        return a;
    //    }

}
