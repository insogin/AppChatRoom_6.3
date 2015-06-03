# Android Chat App: The Client Side.

## Description
This Android hand-held system based app is a simple version of real time  
chat app, which contains the following functions: Register new user and  
saving his/her information, the username, avatar etc., quick login for re-  
turning user. The chat room supports multi people chatting, when one of  
the user joining or exiting the chat room, all of the other users will receive  
the notification.   
Beyond the regular message text, one can also send the emotion, which stored  
in the default image of emotion package. Above each bubble of message, the  
sending time information is also provided. Technically, for the communication  
between the client and the server, each message contains a flag to indicate its  
message type (register, login, exiting or regular message).  

In this version, the following modifications are made as improvements: 1. More   
friendly login menu as the first activity of opening the app (Fig 1), user now can  
choose his/her username here instead of in the chat room by clicking “manipulation”.  
2. Hided the server setting, including the server ip and the port number, thus  
preventing the manually setting these by user. Because in real case, the server is  
always available with invariable parameters and the clients don’t need to know.

![](https://raw.githubusercontent.com/insogin/AppChatRoom_6.3/HEAD/screenshot1/login.jpg)
![](https://raw.githubusercontent.com/insogin/AppChatRoom_6.3/HEAD/screenshot1/register.jpg)
![](https://raw.githubusercontent.com/insogin/AppChatRoom_6.3/HEAD/screenshot1/chat.jpg)







## Outline of the code

The flow chart of the application is shown as follows, the aforementioned three  
activities are the basic processes to interact with users directly.

![](https://raw.githubusercontent.com/insogin/AppChatRoom_6.3/HEAD/screenshot1/Activity.jpg)

#### UserLoginActivity.java
The [`UserLoginActivity.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/chatroom/UserLoginActivity.java) handles the avivity of login, in which the view of `login.xml`  
is setted.

#### UserRegisActivity.java
The [`UserRegisActivity.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/chatroom/UserRegisActivity.java) handles the activity of register, in which the view of  
`register.xml`is setted.

#### ChatActivity.java
The [`ChatActivity.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/chatroom/ChatActivity.java) cooperates many other classes to handle the real time chat  
activity, in which the view of `main.xml` is setted.

#### ChatMsgViewAdapter.java
The [`ChatMsgViewAdapter.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/adapter/ChatMsgViewAdapter.java) is an adapter of ListView (id: lv_message), in the  
`main.xml`.

#### ExpressionGvAdapter.java
The [`ExpressionGvAdapter.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/adapter/ExpressionGvAdapter.java) is an adapter of GridView, in the `express_gv.xml`.

#### Message.java
The [`Message.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/bean/Message.java) is a class to deal with the communication with the server.

#### User.java
The [`User.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/bean/User.java) defines methods to manipulate many private variables.

#### ContentFlag.java
The [`ContentFlag.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/constant/ContentFlag.java) sets three flags of user, corresponding to the states of  
"online", "offline" and "register".

#### UserDbHelper.java
The [`UserDbHelper.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/db/UserDbHelper.java) is an auxiliary class of SQLite data base to handle the users'  
information.

#### IhandleMessage.java
The [`IhandleMessage.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/impl/IhandleMessge.java) serves as an interface to handle the message.

#### MessageService.java
The [`MessageService.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/service/MessageService.java) builds the connection to the server and handle the sending  
and receiving messages.

#### RegisterService.java
The [`RegisterService.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/service/RegisterService.java) handles the register message of a new user.

#### UserService.java
The [`UserService.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/service/UserService.java) is a class of tool to deal with data stream.

#### ExpressionUtil.java
THe [`ExpressionUtil.java`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/tool/ExpressionUtil.java) is used to handle the message of expression.

#### StreamTool.java
[`StreamTool`](https://github.com/insogin/AppChatRoom_6.3/blob/HEAD/src/com/wenjin/tool/StreamTool.java)



## Acknowledgement
I would like to give special thanks to Dr. Andy Li, Dr. Kaikai Liu and Dr. Ze Yu (In alphabetical  
order). Specifically, Dr. Li inspired me  interesting of java & Android programming and  
also always tries to help me to form a good habit of learning and programming. Dr. Liu  
and Dr. Yu are always available and willing to give kind help with regarding to my problems  
in the process of my learning.

## References
* Schildt, Herbert. Java: A Beginner's Guide Sixth Edition. McGraw-Hill, Inc., 2014.
* [Adam Porter. Programming Mobile Applications for Android Handheld Systems: Part 1](https://class.coursera.org/androidpart1-004)
* [Adam Porter. Programming Mobile Applications for Android Handheld Systems: Part 2](https://class.coursera.org/androidpart2-003)


## Origins
* [Ying Xu. The Chat App based on Android. 2013.](http://download.csdn.net/detail/jiangliloveyou/6457969)

### Contact me
* yangwenjincshn@gmail.com
