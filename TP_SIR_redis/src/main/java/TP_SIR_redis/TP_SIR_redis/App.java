package TP_SIR_redis.TP_SIR_redis;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	/**  Exemple 1  **/
    	/*Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        System.err.println(value);    */
        /** 
         * ---> reponse "bar"
         */
    	
    	
    	
        /**  Exemple 2  **/
       /* Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.get("counter"));
        jedis.incr("counter");
        System.out.println(jedis.get("counter"));*/
        /** 
         * ---> reponse 
         * 1
         * 2
        **/
        
    		/**  Exemple 3  **/    	
		 /* String cacheKey = "cachekey";
		  Jedis jedis = new Jedis("localhost");
		  // adding a new key
		  jedis.set(cacheKey, "cached value");
		  // setting the TTL in seconds
		  jedis.expire(cacheKey, 15);
		  // Getting the remaining ttl
		  System.out.println("TTL:" + jedis.ttl(cacheKey));
		  try {
			Thread.sleep(1000);
		  }catch (InterruptedException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		  System.out.println("TTL:" + jedis.ttl(cacheKey));
		  // Getting the cache value
		  System.out.println("Cached Value:" + jedis.get(cacheKey));
		
		  // Wait for the TTL finishs
		  try {
			 Thread.sleep(15000);
		  }catch (InterruptedException e) {
			 // TODO Auto-generated catch block
			  e.printStackTrace();
		  }
		  // trying to get the expired key
		  System.out.println("Expired Key:" + jedis.get(cacheKey));*/
		  /**
		   * TTL:15
		   * TTL:14
		   * Cached Value:cached value
		   */
		  
    	/**  Exemple 4  **/    
		  	String cacheKey = "languages";
	        Jedis jedis = new Jedis("localhost");
	        // Adding a set as value

	        jedis.sadd(cacheKey, "Java");
	        jedis.sadd(cacheKey, "C#");
	        jedis.sadd(cacheKey, "Python");// SADD

	        // Getting all values in the set: SMEMBERS
	        System.out.println("Languages: " + jedis.smembers(cacheKey));
	        // Adding new values
	        jedis.sadd(cacheKey, "Java");
	        jedis.sadd(cacheKey, "Ruby");
	        // Getting the values... it doesn't allow duplicates
	        System.out.println("Languages: " + jedis.smembers(cacheKey));
	        /**
	         * Réponse : 
	         * Languages: [C#, Python, Java]
	         * Languages: [C#, Ruby, Python, Java]
	         */
	        


    }
}
