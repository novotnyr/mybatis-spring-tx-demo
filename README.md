About
=====
This is a demo of MyBatis + Spring 5.x + Transactional behaviour with @Transactional annotations.

Run
===

Run

	mvn jetty:run

Requests
========
Money transfer
--------------

	curl -X POST -H "Content-Type: application/json" http://localhost:8080/bank/accounts/johndoe/transfers -d '{ "beneficiary" : "marysue", "amount": 50 }'

View data for account
---------------------

	http://localhost:8080/bank/accounts/johndoe

There are two account:

*	johndoe
*	marysue

