# Botnet-Detection-using-traffic-analysis-and-response-time

* Step 1: The mIRC client chat will be installed in the system.
* Step 2: A bot will be created using the PircBot framework that will connect to the server
and join a particular channel (Here the channel name is #pircbot) in the server using the IP
address and the channel name.
* Step 3: The bot master will connect to the mIRC application and will connect to the
server and join a particular channel.
* Step 4: When the bot master enters the keyword ‘host’ the host details of the system
will be captured and sent to the bot master by the bot.
 -When the bot master enters the keyword ‘time’ the time on the machine where the
bot resides will be captured and sent to the bot master by the bot.
 -If the bot master enters the keyword “status” the bot will reply with the machine
status informing that the system got infected.
 -Host details are critical information as this information can be used by the bot
master to access a system remotely or
 1.Compromise confidential data
 2.Delete important files
 3.Obtain details of a bank account
* Step 5: By using the application, the bot messages will be scanned, and the system
will be identified as bot infected.
* Step 6: Based on their response time the bot net is identified. If the receiver is a
normal human being then response time would be larger. If it is a bot the response time
would be less than 260ms.
