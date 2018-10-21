----------------------------------------------------------------------------------------
----------------------------------Socks Identifier--------------------------------------
----------------------------------------------------------------------------------------
-------------------------------Developed & Designed By----------------------------------
-----------------------------------Mayank Pandit----------------------------------------
----------------------------------------------------------------------------------------

---Description of Problem and Solution---

PROBLEM - Given a string that represents a list of socks, print out the pairs of unique identifiers that
	  is associated with each sock.

Given String socksString = "1/blue/right,2/blue/right,3/red/right,4/blue/left,5/purple/left,6/red/left,
			   7/green/left,8/red/left,9/blue/left";

Logic Behind the Scene - Think the provided string as a basket full of socks

Solution - ArrayList is used so as to make code flexible for number of socks
	>> Remove one sock at a time from the basket(String) and identify its colour and side of pair
	>> Number these socks as removed from the basket(String)
	>> Start matching the sock with each other
	>> Display it to the console when matched pair is found
	>> Apply same for the remaining socks

----Tools and Languages used----
>> Eclipse JEE Oxygen IDE
>> Languages - Java
>> Console for showing output

---Sample Output---

Output for finding Matched Pair in order by unique identifier
1 4
2 9
3 6


Thank You