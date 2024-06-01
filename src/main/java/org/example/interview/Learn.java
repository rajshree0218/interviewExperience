package org.example.interview;

public class Learn {

    /*
    * // Why java is not 100% object oriented
    * A. Because of primitive data types namely:
    * boolean, byte, char, int, float, double, long, short.
    *
    * to make them Object oriented we have wrapper class which
    *  actually wrap the primitive type into object of that class.
    *
    *
    * // Why pointers are not used in java?
    * Because
    * 1. They are unsafe.
    * 2. increases the complexity of the program and since java is k/wn for it's simplicity of code
    * adding the concept of pointers will be contradicting.
    * 3. since JVM is responsible for implicit memory location, thus in order to avoid direct memory
    * access to memory by the user, pointers are discouraged in java.
    *
    * // What is JIT compiler in java?
    * java source code ->   JDK  -> byte code
    * you have java source code, we create the java source code, then we have JDK, JDK has
    * the Javac.exe. which is nothing but a compiler. this compiler converts the source code into byte code.
    * once we have byte code, it will go to JRE/JVM. it contains nothing but Interpreter + JIT(just in time) compiler.
    * this byte code needs to be machine independently, JDk and JRE is machine dependent. but byte codes are
    * machine independent. which is understood by system.
    * Interpreter: it will go line by line and convert your code into machine language which is understood by system.
    * but making it interpreter it decreases your efficiency.
    * JIT compiler : responsible for performance optimization of java application at runtime.
    * how it does it.
    * to make some code fastly compile into machine code.
    *
    *
    * // Why String is immutable in java?
    * 1. String pool requires String to be immutable otherwise shared reference can be changed from anywhere.
    * 2. Security, bcz string is shared on different are like file system, networking connection, database connection,
    * having immutable string allows you to be secure and safe because no one can change reference of string once
    * it gets created.
    *
    *
    * // What is marker interface?
    * A marker interface can be defined as the interface having no data member and member functions. In simple terms,
    * an empty interface is called the Marker interface.
    *
    * example: Serializable, Cloneable.
    *
    * // Can you override private and static methods?
    * 1. you can not override a private/static/final method in java.
    * 2. you can not override a private method in subclass bcz its not accessible there, what you do is create
    * another private method with the same name in the child class.
    * 3. For static methods if you create a similar method with the same return type and same method argument in child class
    * then it will hide the superclass method, this is k/ws as method hiding.
    *
    *
    * // Does finally always execute?
    * Yes. but not in following cases :
    * 1. System.exit() function
    * 2. System crash.
    *
    *
    * // What methods does the Object class have?
    * protected Object Clone() throws CloneNotSupportedException
    *  creates and return the copy of this object.
    *
    * public boolean equals(Object obj)
    *  indicates whether some other objects is equal to this one.
    *
    * protected void finalize() throws Throwable
    *  called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
    *
    * public final Class getCLass()
    *   returns the runtime class of an object.
    *
    * public int hashCode()
    *  return hashcode value for the object.
    *
    * public String toString()
    *  Returns a String representation of the object.
    *
    * public final void notify()
    * public final void notifyAll()
    * public final void wait()
    * public final void wait(long timeout)
    * public final void wait(long timeout, int nanos)
    *
    * // How can you make class Immutable?
    * 1. Declare the class as final so it cant be extended.
    * 2. make all fields private so that direct access is not allowed.
    * 3. don't provide setter method for variables.
    * 4. make all mutable fields final so that it's value can be assigned only once.
    * 5. Initialize all the fields via a constructor performing a deep copy.
    * 6. Perform a cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
    *
    *
    * //What is Singleton class and how can we make a class Singleton?
    * Singleton class is a class whose only one instance can be created at any given time, in one JVM.
    *
    *
    *
    * //Explain Collection hierarchy ?
    * Collection : It is root interface of java collection framework. and most of the collections in java are inherited
    * from this interface except Map interface.
    * List : java.util.List
    *        Contains ordered element
    *        May contain duplicates.
    *        support index bases search, random access but element can be easily inserted irrespective of the position.
    *
    * Set : contains unique elements.
    *       doesn't define an order for the element hence index based search is not supported.
    *
    * Queue : java.util.Queue
    *           follows a FIFO search
    *           elements adds at rear end and removes from the front end.
    *
    * Map : java.util.Map
    *       Represents a key value pair.
    *       Map interface doesn't implement the collection.
    *       it can only contain a unique key
    *       can have duplicate value.
    *
    *
    * List
    * ArrayList  : dynamic resizing - 50% of original size, non synchronized
    * LinkedList : implements List and Deque1 interfaces.
    *               maintains the insertion order.
    *               non synchronized
    *               does not support accessing element randomly
    *               can use ListIterator to iterate LinkedList elements
    *
    * Vector : Vector is synchronized
    *           maintains the insertion order
    *           it's thread safe.
    *           Vector increases it's size by double the array size.
    *           it's legacy class.
    * Stack : last-in-first-out
    *           the elements are added as well as removed from the rear end.
    * Stack extends Vector class.
    *
    *
    * Set :
    * HashSet : it implicitly implements HashTable
    *           contains only unique elements
    *           only one null element can be added.
    *           its unordered as set
    * LinkedHashSet : Ordered version of HashSet which maintains doubly linkedlist across all elements.
    *                   it preserves the insertion order.
    *
    * Set :
    * SortedSet : All elements of sortedset must implement the Comparable interface.
    *               it;s set sorted in an ascending order.
    * TreeSet : Uses a Tree for storage(Self balanced tree like Red-Black Tree)
    *           Objects in a TreeSet are stored and ascending order.
    *
    * Set interface is extended by SortedSet interface. and it's implementing class is TreeSet.
    *
    *
    *
    * Queue :
    * PriorityQueue : Priority Queue is a queue with priority associated with each elements.
    *                   high priority element is served before a low priority element irrespective of their insertion order.
    * Deque1 : Deque1 refers to double ended queue.
    *           elements can be added and removed from either end.
    * ArrayDeque : a way to apply resizable array in addition to the implementation of the Deque1 interface.
    *               no capacity restriction.
    *
    * Deque1 interface extends queue interface.
    *
    *
    * Map
    * HashMap : it is non synchronized in nature.
    *           allow only one null key and multiple null values.
    * HashTable : it is synchronized in nature.
    *               Doesn't allow any null key or null values.
    * SortedMap : entries are maintained in ascending order.
    * TreeMAp : Implicitly implements Red Black Tree implementation.
    *           can not store null keys.
    *
    *
    * // Why Map does not extend the collection interface?
    * 1. the map interface in java follows a key/value pair structure whereas the collection interface is a
    *    collection of objects which are stored in structured manner with specified access mechanism.
    * 2. the main reason map doesnot extend the collection interface is that the add(E e) method of the
    *    Collection interface doesn't support key value pair like Map interface's put(K,V) method.
    * 3. it might not extend collection interface but still is an integral part of the java collection framework.
    *
    *
    * // Diff  b/w fail fast and fail safe iterators?
    * Fail-fast throws ConcurrentModificationException when one thread is iterating over collection object and other
    *  other thread structurally modify collection either by adding, removing, or modifying object on underlying collection.
    * They are called fail fast bcz they try to immediately throw exception when they encounter failure.
    *
    * Fail-Safe iterator doesn't throw exception. if collection is modified structurally while one thread is iterating
    * over it bcz they work on clone of collection instead of original collection and that's why they are called
    *  as fail safe iterator.
    *
    *
    * // what do you understand by BlockingQueue?
    * BlockingQueue interface, java.util.concurrent.BlockingQueue.
    * represents a queue which is thread safe to put elements into and take elements out from.
    * in other words, multiple thread can be inserting and taking elements concurrently from a java BlockingQueue,
    * without any concurrency issues arising.
    *
    * It is capable of blocking the thread that try to insert or take element from the queue.
    * for instance, If a thread tries to take an element and there are none left in the queue, the thread can
    * be blocked until there is an element to take.
    *
    *
    * // Diff b/w Synchronized collection and Concurrent collection?
    * 1. Both synchronized and concurrent collection class provide thread safety.
    * 2. the diff b/w them comes in performance, scalability and how they achieve thread safety.
    * 3. Synchronized collections like synchronized hashmap are much slower than their concurrent counterparts.
    * ex. ConcurrentHashMap, main reason for this slowness is locking.
    *
    * Segment1, Segment2, segment3, segment4:
    * write operation on Segment 1.
    * Whole segment is locked by this thread and other threads have to wait in synchronized collection.
    *
    * while in concurrent collection only segment 1 is locked for read and write operations, while all the
    * other 3 segments are open for other threads. it called lock stripping.
    *
    *
    * // Internal working of HashMap ?
    * hashmap in java works on hashing principle where hash functions are used to link key and value inn hashmap.
    * Objects(Map.Entry -> contains both key and value object) are stored by calling put(key,value) method of
    * hashmap and retrieved by calling get(key) method.
    *
    * when we call put(k,v) method, hashcode method of the key object is called which calculates an index of the
    * bucket where we can store the value object.
    *
    * To retrieve, you call the get() method and again pass the key object, which lands you up at same index,
    * or bucket and you retrieve the value object.
    *
    * If two diff key returns same hash index, then collision occurs in this case, a linkedlist is formed at
    * that bucket location and a new entry is stored as next node.
    *
    * now put method will just append the object nodes in the linkedlist.
    *
    * but in case of get if we have a linkedlist at that index then we need an extra check to search correct
    * value, this is done by equals() method . it checks every key of every node and if equals() returns true
    * then map return that corresponding value from linkedlist.
    *
    */

    //GARBAGE COLLECTOR
    /*
    * // what is garbage collection and what are it's advantages?
    * Garbage Collection in java is an automatic process of looking at heap memory. identifying which objects
    * are in use and which are not, and deleting the unused objects.
    *
    * An in use object, or a referenced obj, that some part of your program still maintains a pointer to that obj.
    *
    * an unused obj, or unreferenced obj is no longer referenced by any part of your program. so the memory
    * used by an unreferenced can be reclaimed.
    *
    * main advantages of automatic garbage collection in java is that it removes the burden of manual
    * memory allocation/de-allocation from us so that we can focus on problem solving.
    *
    *
    * // Where are the objects created in memory? on stack or heap?
    * whenever an object is created, it's always stored in the heap space and stack memory contains the
    * reference to it. stack memory only contains local primitive variables and reference variables to
    * objects in heap space.
    *
    * Thus all java objects are always created on heap in java.
    * Ex : CustomObject s1 = new CustomObject();
    * Stack : s1
    * Heap : CustomObject
    *
    *
    * // which part of the memory is involved in Garbage collection? stack or heap?
    * Heap.
    *
    * // who manages the garbage collector?
    * The JVM controls the Garbage collector.
    * It's the one decides when to run the Garbage collector.
    * JVM runs the garbage collector, when it realizes that the memory is running low.
    * One can request the Garbage collection to happen from within the java program but there is no guarantee
    * that this request will be taken care of by JVM.
    *
    *
    * // How can the garbage collection be requested?
    * There are two ways in which we can request the jvm to execute the garbage collection:
    * 1. call the System class, System.gc() method which will request the jvm to perform GC.
    * 2. the methods to perform the garbage collections are present in the Runtime class provided by java.
    * the runtime class is a Singleton for each java main program. the method getRuntime() returns
    * a singleton instance of Runtime class. the method gc() can be invoked using this instance of
    * Runtime to request the garbage collection.
    *
    * Learn obj = new Learn();
        obj = null;
        // Runtime.getRuntime().gc();
        System.gc();
        System.out.println("Main method is done");
    *
    *
    * // When an obj becomes eligible for garbage collection?
    * an obj becomes eligible for garbage collection when no live thread can access it.
    * Objects not in use (unreferenced obj) are those obj which are not needed by java program,
    * no part of java program is pointing to that objects.
    * so these unused obj can be cleared in GC process, and memory used by an unreferenced obj can be reclaimed.
    *
    *
    * // what all are the diff ways to make an obj eligible for garbage collector when it is no longer needed?
    * 1. set all variables obj reference to null.
    * 2. make the reference vari. to refer to another obj.
    * 3. creating island of isolation.
    *
    *
    * // how many times does the garbage collector calls the finalize() method for an obj.?
    * only once.
    *
    *
    * //is garbage collector a foreground or background thread?
    * garbage collector is a background/daemon thread.
    * what is daemon thread?
    * a daemon thread runs behind the application.
    * its started by JVM.
    * the thread stops when all non-daemon / foreground threads stop.
    *
    * */

    // HIBERNATE
    /*
    * Why Hibernate?
    * hibernate eliminates all the boiler plate code that comes with JDBC
    * it supports HQL with is more object oriented
    * it provides txn management implicitly.
    * hibernate allows JDBCException or HibernateException which are the unchecked exception, so we dont need to worry
    * about handling using try and catch.
    * hibernate supports caching for better performance.
    *
    *
    * // Imp interface used in hibernate
    * SessionFactory (org.hibernate.SessionFactory) : instance of this used to retrieve Session object for
    * database operations. we need to initialize that once and can cache it to reuse it again and again. it's like
    * one SessionFactory obj per database connection. Like 1 for mysql, 1 for oracle.
    *
    * Session (org.hibernate.Session) : It;s factory for txn. it's used for connecting application with persistent
    * store like hibernate framework/DB. it is used to get a physical connection with database.
    * it also provides method for CRUD operations.
    *
    * Transaction (org.hibernate.transaction) : this specifies single/atomic units of work.
    *
    * // SessionFactory factory = metadata.getSessionFactoryBuilder().build();
    * SessionFactory factory = HibernateUtil.getSessionFactory();
    * Session session = factory.openSession();
    * Transaction txn = session.beginTransaction();
    *
    * session.save(persistentObj);
    * txn.commit();
    * factory.close();
    * session.close();
    *
    *
    * // Imp annotation used in hibernate?
    * javax.persistent.Entity : Used with model classes to specify that they are entity beans.
    * javax.persistent.Table : used with entity class, to define the corresponding table name in database.
    * javax.persistent.Access: used to define the access type, either field or property. Default values is field
    * and if you want hibernate to use getter/setter methods then you need to set it to property.
    * ex : @Access(value=AccessType.PROPERTY)
    *
    * javax.persistent.Id: used to define the primary key in the entity bean.
    * javax.persistent.EmbeddedId : used to define composite primary key in the entity bean.
    * javax.persistent.Column : used to define column name in database table.
    * javax.persistent.GeneratedValue : used to define strategy to be used for generation of primary key. used in
    * conjunction with javax.persistent.GenerationType.
    * ex.GenerationType.IDENTITY
    *
    * javax.persistent.OneToOne : used to define the one to one mapping b/w two entity beans. we have other similar
    * annotation annotations as OneToMany, ManyToOne, ManyToMany.
    *
    * org.hibernate.annotations.Cascade : used to define the cascading b/w two entity beans, used with mappings.
    * it works in conjunction with org.hibernate.annotations.CascadeType.
    * javax.persistent.PrimaryKeyJoinColumn :used to define the property for foreign key. used with org.hibernate.annotations.GenericGenerator
    * and org.hibernate.annotations.Parameter.
    *
    *
    * // Mappings in hibernate?
    * there are 3 types of association mapping in hibernate.
    * One to one
    * Many to one
    * Many to many
    *
    * @OneToMany(targetEntity = CustomTest.class)
    * private CustomTest obj;
    *
    * @ManyToOne(cascadeType=CascadeType.ALL)
    * private Address address;
    *
    * @ManyToMany(targetEntity = Degree.class, cascadeType = CascadeType.ALL)
    * @JoinTable(name = "DegreeStudentThirdTable",
    *              joinColumns={@JoinColumn(name="StudentId")},
    *              inversionJoinColumns = {@JoinColumn(name="CertificateId")})
    * private List<Degree> degrees;
    *
    *
    *
    * // what are hibernate configuration file?
    ‹?xml version='1.0' encoding='UTF-8'?>
    ‹!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 5.3//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-5.3.dtd">

    ‹hibernate-configuration>
        <session-factory>
            ‹property name="hbm2ddl.auto"›update</property>
            ‹property name="dialect"›org.hibernate.dialect.Oracle9Dialect</property>
            ‹property name="connection.url"›jdbc:oracle:thin:@localhost:1521:xe</property>
            ‹property name="connection.username"›codedecode</property> < property name="connection.password">codedecode</property>
            ‹property name="connection driver _class"›oracle.jdbc.driver.OracleDriver‹/property>
        <mapping resource="employee.hbm. xm1"/>
        </session-factory›
    ‹/hibernate-configuration>
    *
    * Contains database specific configuration and used to initialize SessionFactory.
    * conventionally, it's name should be hibernate.cfg.xml.
    * if you need to connect to SQL then create another one here.
    *
    *
    * // what are hibernate mapping file?
    * ‹?xml version='1.0' encoding='UTF-8'?>
      ‹!DOCTYPE hibernate-mapping PUBLIC
            "-//Hibernate/Hibernate Mapping DTD 5.3//EN"
            "http://hibernate.sourceforge.net/hibernate-mapping-5.3.dtd'
            ot
    ‹hibernate-mapping>
        ‹class name="com.codedecode.Employee" table="empTable">
          <id name="id"›
            ‹generator class="assigned"></generator›
          </id›
          <property name="firstName"></property>
          ‹property name="lastName"></property>
        </class>
    </hibernate-mapping>

    *
    * the mapping file name conventionally, should be class_name.hbm.xml
    * hibernate-mapping: root element
    * class : specifies the persistent class.
    * Id: specifies the primary key attribute in the class.
    * generator: used to generate the primary key.
    * property: specifies the property name of the Persistent class.
    *
    *
    *
    * // steps to create a sample app of hibernate
    * Create the Persistent POJO. Ex : Employee
    * Create the mapping file
    * create the configuration file
    * class for retrieving for storing the persistent POJO.
    * Run the application to see result.
    *
    *
    * // diff b/w openSession and getCurrentSession
    * getCurrentSession() method returns the session bound to the context.
    * Since this session object belongs to the context of hibernate, it is okay if you dont close it.
    * once the SessionFactory is closed. this session objects gets closed.
    *
    * while
    *
    * openSession() methods help in opening a new session.
    * you should close this session object once you are done with all the database operations. And Also,
    * you should open a new session for each request in a multi-threaded env.
    *
    * // diff b/w Session get() and load() method?
    * get() loads the data as soon as it's called whereas load() returns a proxy object and loads
    * data only when its actually required. so load() is better bcz it support lazy loading.
    *
    * Since load() throws exception, when data is not found, we should use it only when we know data exists.
    *
    * we should use get() when we want to make sure data exists in the database.
    *
    *
    * // hibernate caching - types
    * first level cache
    * second level cache
    * query cache
    *
    * // what is first level cache
    * hibernate creates first level cache using persistent context.
    * hibernate caches query data to make our application faster and improves performance.
    * the idea behind cache is to reduce the number of database queries.
    * hibernate first level cache is associated with the session object.
    * hibernate first level cache is enabled by default and there is no way to disable it.
    * still hibernate provides method through which we can delete selected objects from the cache or clear the cache completely.
    * any object cached in a session will not be visible to other sessions and when the session is closed, all the cached obj will be lost.
    *
    * // what is second level cache?
    * hibernate second level cache is disabled by default but we can enable it through configuration.
    * currently EHCache and Infinispan provides implementation for hibernate second level cache and we can use them.
    *
    * // Configure second level cache using EHCache
    * add hibernate-ehcache dependency in your maven project, if its not maven then add corresponding jars.
    * add below property in hibernate configuration file
        ‹property name="hibernate.cache.region.factory_class"›org.hibernate.cache.ehcache.EhCacheRegionFactory</property>
        <property name="hibernate.cache.use_second_level_cache"›true‹/property>
        <property name="hibernate.cache.use_query_cache">true‹/property>
        ‹property name="net.sf.ehcache.configurationResourceName*>/codedecodeehcache.xml</property>
    *
    * crate EHCache configuration file, a sample file codedecodecache.xml is below
    * <xml version encoding="UTF-8". ?>
      <ehcache xmls:xsi="https://www.w3.org/2001/XMLSchema-instance"
        xsi:noNamespaceSchemaLocation="ehcache.xsd" updateCheck="true"
        monitoring="autodetect" dynamicConfig="true">
        <diskStore path="java.io.tmpdir/ehcache" /›
        ‹defaultCache maxEntriesLocalHeap="10000" eternal="false"
            timeToIdleSeconds="120" timeToLiveSeconds="120" diskSpoolBufferSizeMB="30"
            maxEntriesLocalDisk="10000000" diskExpiryThreadIntervalSeconds="120"
            memoryStoreEvictionPolicy="LRU" statistics="true">
            ‹persistence strategy="loca_TempSwap" / ›
        </defaultCache>

        ‹cache name="employee" maxEntriesLocalHeap="10000" eternal="false"
            timeToIdleSeconds="5" timeToLiveSeconds="10" ›
            ‹persistence strategy="localTempSwap" / ›
        </cache>

        ‹cache name="org.hibernate.cache.internal. StandardQueryCache"
            maxEntriesLocalHeap="5" eternal="false" timeToLiveseconds="120">
            ‹persistence strategy="localTempSwap" / ›
        </cache>

        ‹cache name="org.hibernate.cache.spi.UpdateTimestampsCache"
            maxEntriesLocalHeap="5000" eternal="true">
            ‹persistence strategy="localTempSwap" / ›
        </cache>
      </ehcache>
      *
      *
      * annotate entity beans with @Cache annotation and caching strategy to use.
      * import org.hibernate.annotations.Cache;
      * import org.hibernate.annotations.CacheConcurrencyStrategy;
      *
      * @Entity
      * @Table(name="Address")
      * @Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="employee")
      * public class Address{
      *
      * }
      *
      *
      * // how to integrate hibernate with spring ?
      * spring is JAVA EE framework extensively used in enterprise applications.
      * Hibernate is the most popular ORM framework.
      * This is why Spring hibernate combination is used in a lot of enterprise applications.
      * steps to integrate:
      *     Add required dependencies
      *     create entity, controller, service and DAO layers as required.
      * and thats it. its as simple as that.
      *
      *
      * // GenerationType.Sequence
      * If generation type is sequence then in this case hibernate creates a another table
      * where it maintains the sequence and get the latest number.
      * Ex. in Employee table id is 4, which is last entry.
      * then in the hibernate sequence table, entry would 5.
      *
      * //how can we see hibernate generated SQL on console?
      * to generate the sql command generated at the back end we need to add following property:
      * <property-name="show sql">true</property>
      * or
      * spring.jpa.show.sql=true
      *
      * // entity life cycle and states
      *   new operator/new entity                     persist                         retrieve -find/query
      *   ----------------------------> New ----->   Managed <-------------------
                                                   /       | ^                  |
                                                  /        | |  persist         DB
                                    clear/close  /  removed| |                  ^
                                               *           * |                  |
                                          Detached      removed------------------
                                                                flushed/commit

      *
      * This is the diff b/w JPA and hibernate ->
      * hibernate allow us to remove even the detached entity.
      * session.clear();
      * session.delete(employee);
      *
      *
    * */

    /*
    * The Architecture of the application you have worked upon
    * create CRUD in 60 min/120 min
    * Exception handling in Spring
    * Global exception handling
    * spring security end to end.
    *
    * Explain the architecture of your application you have worked upon.
    *
    * Client Server Architecture.
    * Explain layers in your architecture
    * We can layer/split an application in a client server architecture as :
    * 1. Presentation Layer
    * 2. Business Layer
    * 3. Data Source
    * We usually have 3 tier architecture.
    *
    * Why we need controller service DAO separated.
    * we use programming language like java to implement Business logic on server.
    * it's further more modularized/divide into
    * controller layer
    * business layer
    * dao layer
    *
    *
    * // how to create a spring + hibernate projects from scratch.
    * using STS create Spring starter project and during creation select 3 dependencies.
    * spring boot starter jpa
    * spring boot starter web
    * mysql driver
    * lombok
    * then add the following properties in application prop file
    * spring.datasource.url=jdbc:mysql//localhost:3306/codedecore?useSSL=false
    * spring.datasource.username=root
    * spring.datasource.password=root
    * spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
    * spring.jpa.hibernate.ddl-auto=update
    *
    *
    * // what is Hibernate N+1 select Problem
    * The N+1 select problem is a performance issue in hibernate. In this problem,
    * a java application makes N+1 database calls(N=number of child objects fetched).
    * For Example:, if N=2, the application makes 3(N+1=3) database calls.
    *
    * Ex: Employees and Departments have many to one relationship.
    * One department (Parent) can have multiple Employees(Child)
    * unidirectional mapping. By default its lazy
    * using
    * @OneToMany(fetch=FetchType.LAZY)
    * @JoinColumn(name="Dept_id") // dept_id will be column in Employee table.
    * List<Employee> listOFEmployees;
    *
    * Now we need to fetch all departments.
    *
    * What all steps will be done now to fetch all departments:
    * - by default its lazy so first a call goes to Department table and fetch all departments (only id and name --> no employees list fetched)
    * - Then while returning for each department now a call goes to fetch list of employees, so N call goes now, each for 1 department.
    *
    * At SQL level, what ORM needs to achieve to avoid N+1 is to fire a query that joins the two tables and get combined results in single query.
    *
    * Spring Data JPA Approach - using left join fetch, we resolve the N+1 problem.
    * using attributePaths, Spring Data JPA avoids N+1 problem.
    * 2 ways:
    * - using left join fetch - we can use JOIN FETCH. the FETCH keyword of the JOIN FETCH statement is JPA specific.
    * it instructs the persistence provider to not only join the two databases tables contained in the query, but also intialize
    * the association on the returned policy. It works with both JOIN and LEFT JOIN statements.
    *
    * public interface DepartmentCrudRepo extends JpaRepository<Department, Long>
      {
            @Query("SELECT p FROM Department p LEFT JOIN FETCH p.listOfEmployee")
            List<Department> findWithoutNPlusOne();

            @EntityGraph(attributePaths = {"listOfEmployees"})
            List<Department> findAll();
      }
    *
    *
    * -using attributePath, -EntityGraphs: are introduced in JPA2.1 and used to allow partial or specified fetching of objects.
    * When an entity has referenced to other entites we can specify a fetch plan by EntityGraphs in order to determine which fields or properties should be fetched together.
    *
    *
    * Hibernate Approach :
    * using HQL query = "from Department d join fetch d.listOfEmployees Employee"
    * Criteria criteria = session.createCriteria(Department.class);
    * criteria.setFetchMode("listOfEmployees", FetchMode.EAGER);
    *
    *
    *
    *
    * */

    /*
    * @RestController : is the base annotation for classes that handle REST operations.
    * @ControllerAdvice: this annotation handles exception globally. it allows you to use the same ExceptionHandler for multiple controllers.
    * This way, we can define how to treat an exception in just on place because this handler will be called whenever the exception is thrown from classes that are covered by ControllerAdvice.
    * as the name suggests, is Advice for multiple controllers.
    * allows our class to be a global interceptor of exceptions thrown by methods annotated by @RequestMapping.
    *
    * @ExceptionHandler: spring annotation that provides a mechanism to treat exception that are thrown during execution of handlers(controller operations).
    * This annotation, if used on methods of controller classes, will serve as the entry point for handling exceptions thrown within this controller only.
    * Altogether, the most common way is to use @ExceptionHandler on methods of @ControllerAdvice classes so that the exception handling will be applied globally or to a subset of controllers.
    * @ExceptionHandler and @ControllerAdvice are used to define a central point for treating exceptions and wrapping them up in a class.
    *
    * @ResponseStatus: our error responses are always giving us the HTTP status 500 instead of a move descriptive status code. to address this we can we annotate our Exception with @ResponseStatus
    * and pass in the desired HTTP response status.
    * you can also override the existing handles, Spring Boot's built-in experience class ResponseEntityExceptionHandler has multiple methods that you can override to customize the exception handling further.
    *
    *
    * */

    /*
    * Multithreading and Multitasking
    * // What is Multi threading and how is it diff from multi tasking
    * Multi threading is a specialized form of multitasking.
    * Process Based Multitasking : it is executing several tasks simultaneously where each task is a separate independent process
    * is Process based multitasking.
    * For ex: process based multitasking enables you to run the java IDE at the same time that you are using a text editor or
    * visiting a web site using chrome.
    *
    * Thread Based Multitasking: it is executing several tasks simultaneously where each task is a separate independent part
    * of the same program (called thread).
    * For instance, Junit uses threads to run test cases in parallel. As an application, you can have computer games. You see
    * objects in games like cars, motor bikes etc. They are just thread that run in the game application.
    *
    * Thus, process based mutlitasking deals with the big picture, and thread based multitasking handles the details.
    *
    *
    * // which is better process based multitasking or thread based multitasking and why?
    * Thread based multitasking is better.
    * multitasking threads require less overhead than multitasking processes.
    * Processes are heavyweight tasks that require their own separate address spaces.
    * Threads, on the other hand, are ligher weight. They share the same address space and cooperatively share the
    * same heavy weight process.
    * Interprocess communication is expensive and limited. Context switching from one process to another is also costly.
    * Inter thread communication is inexpensive, and context switching from one thread to next thread is lower in cost.
    * while java programs make use of process based multitasking env, process based multitasking is not under java's
    * direct control. however, multithreaded multitasking is.
    *
    *
    * // What is Thread
    * threads are light weight processes within a process.
    * Java creates threads by using a Thread class.
    * All java programs have at least one thread, k/wn as the main thread, which is created by the JVM at the
    * program's start, when the main() method is invoked with the main thread.
    *
    * // Types of thread in java
    * There are 2 types of thread - User Thread & Daemon Thread.
    * User Threads are created by java developers. Ex: main thread. all threads created inside main
    * method(child threads of main thread) are non daemon/ user thread by default, bcz main thread is non daemon.
    * Daemon thread is a low priority thread(in context of JVM) that runs in background to perform tasks such as
    * garbage collection etc. they do not prevent the JVM from exiting (even if the daemon thread itself is running)
    * when all the user threads(non daemon threads) finish their execution. JVM terminates itself when all user threads
    * (non daemon threads) finish their execution. JVM does not care whether daemon thread is running or not. if JVM
    * finds running daemon thread(upon completion of user threads), it terminates the thread and after that shutdown itself.
    *
    *
    * // why  is the o/p not in an order
    * if multiple threads are waiting to execute then which thread will execute 1sis decided by Thread scheduler which is
    * part of JVM hence its vendor dependent and thats why we cant expect execution order/output.
    * so when ever situations comes to multithreading the guarantee in behaviour is very less. we can tell the possible
    * output but not the exact one.
    *
    * // how to make a user thread to a Daemon thread
    * make a user thread to daemon by using setDaemon() method of thread class.
    * this method is used for making a user thread to Daemon thread or vice versa. For ex: if I have a user
    * thread t then t.setDaemon(true) would make it daemon thread. on the other hand if I have a daemon thread td then by
    * calling td.setDaemon(false) would make it normal thread(user thread/non daemon thread).
    * public boolean isDaemon(): this method is used for checking the status of a thread. it returns true if the thraed is
    * daemon else it return false.
    * setDaemon() method can only be called before starting the thread. this method would throw IllegalThreadStateException
    * if you call this method after Thread.start() method
    * the main diff b/w daemon thread and user threads is that the JVM does not wait for daemon thread before exiting while
    * it waits for user threads. it does not exit until unless all the user threads finish their execution.
    *
    *
    * // diff b/w t.start() and t.run()
    * in the case of t.start() a new thread will be createed which is responsible for the execution of run(0 method.
    * but in the case of t.run() no new thread will be created and run() method will be executed just like a normal method
    * by the main thread.
    *
    * in the above program if we are replacing t.start() with t.run() the following is the o/p. Entire o/p produced by only
    * main thread. so it's sequential output always. First child then main/parent.
    *
    * // what are the tasks of start method
    * register the thread with thread scheduler, so you just tell what a child thread should do, when and how it will be
    * scheduled will be handled by scheduler.
    * call run method.
    *
    *
    * // what if we dont override run() method
    * // can we overload run method
    * how do we overload?
    * may be by passing parameters?
    * yes you can but start will call no rg run() only.
    *
    * // can we override start() method
    * if you override start() in your custom class then no initialization will be done by thread class for you
    * run is also not called
    * even new thread too is not created.
    *
    *
    * // can we restart the same thread again?
    * no
    * you will get java.lang.IllegalThreadStateException
    * you cannot do this indirectly too with super.start() in run method.
    *
    * // what is a thread priority
    * Every thread in java has some priority from 1(min)  to 10(max).
    * who uses this priority?
    * thread scheduler uses this while allocation CPu. highest will be given CPU first.
    * what is the default priority of main method?
    * 5
    * what will be priority of its child thread?
    * they inherit from parent.
    * what will be priority is set above 10?
    * java.lang.IllegalArgumentException.
    *
    *
    * */

    /*
    * What is the latest enhancements done in java 1.8 in Hashmap?
    *
    * */

    static{
        System.out.println("static");
    }

    {
        System.out.println("Instance");
    }

    Learn(){
        System.out.println("contructor");
    }

    public static void main(String[] args) {
        Learn obj = new Learn();
    }



}
