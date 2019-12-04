# Spike spring-boot
## Progetto CinemaZ

### Api Calls

-[ ]  GET http://localhost:8080/films
-[ ]  GET http://localhost:8080/screenings
-[ ]  GET http://localhost:8080/cinemas
-[ ]  GET http://localhost:8080/halls/{hallId}
-[ ]  POST http://localhost:8080/reservations
    



###Models:
- [ ] User
```
User : {
  "id": number;
  "name": string;
  "email": string;
}
```
- [ ] Movie
```hql
Movie : {
  "id": number;
  "title": string;
  "cast": [Actor];
}
```
- [ ] Cinema
```hql
Cinema : {
  "id": number;
  "name": string;
  "location": geojson;
  "halls": [Hall];
}
```
- [ ] Hall
```hql
Hall : {
  "id": number;
  "name": string;
  "seats": [Seat]
}
```
- [ ] Reservation
```hql
Reservation : {
  "id": number;
  "userId": number;
  "seat": Seat;
  "screaning": Screening;
}
```
 - [ ] Screening
 ```hql
Screening : {
  "id": number;
  "hallId": number;
  "movieId": number;
  "date": Date;
 }
 ```
