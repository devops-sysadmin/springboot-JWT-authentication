Run This project from IDE
Make a post request to http:localhost:9192/authenticate with any of the below credentials as username and password like below example
 "javatechie", "password"
  "user1", "pwd1"
  "user2", "pwd2" 
  "user3", "pwd3"
  
  Eg: 
  
  curl --location --request POST 'http://localhost:9192/authenticate' \
--header 'Content-Type: application/json' \
--data-raw '{
    "userName": "user1",
    "password": "pwd1"

}'

Use generated jwt token as Beaer token to access an endpoint "/" like http://localhost:9192/
"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYxMTI5MjY4MywiaWF0IjoxNjExMjU2NjgzfQ.fDv_FL9OG0BZ22YTR81WbTdMkhKqvbVDancpfHQDInE"

Eg:

curl --location --request GET 'http://localhost:9192/' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYxMTI4NzUyNywiaWF0IjoxNjExMjUxNTI3fQ.mCbWI3WlVi8om89JT1nS7yLesMpEYNlJkTo8Erx3WpA' 

