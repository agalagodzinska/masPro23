insert into address (id, city, country, flat_number, house_number, postal_code, street_name) values (0, 'Warszawa', 'Polska', null, 4, '40-750', 'Wiktorska');
insert into trainer (is_owner,id,pesel,name,surname,salary) values ( 'no',0,'23456788765','Aga','Kowalska', 200);
insert into trainer (is_owner,id,pesel,name,surname,salary) values ( 'yes',1,'34567543456','Ola','Nowak', 250);
insert into trainer (is_owner,id,pesel,name,surname,salary) values ( 'yes',2,'65434565443','Ania','Krawczyk', 250);
insert into trainer (is_owner,id,pesel,name,surname,salary) values ( 'yes',3,'65434569876','Asia','Kwiatkowska', 250);
insert into facility(id,nip,name,address_id,owner_id) values (0, '111111111111111111', 'TrainHouse', 0, 1);
insert into room (id,number,places_for_trainees, facility_id) values (0, 1, 2, 0);
insert into facility_trainer (facility_id, trainer_id) values ( 0,0 );
insert into workshops (id, date_time, price, spots_available, total_spots, facility_id) values ( 0, {ts '2012-09-17 18:47:52.69'}, 20, 11, 13, 0);
insert into trainee(id,pesel,name,surname,total_hours_training) values ( 4,'87654567899','Jan','Malysz',12 );
insert into course (id,name, date_time, price, spots_available, total_hour_count, total_spots, trainer_id) values ( 0,'hip-hop',{ts '2012-09-17 18:47:52.69'}, 20, 4, 5, 6,0);
insert into course (id,name, date_time, price, spots_available, total_hour_count, total_spots, trainer_id) values ( 1,'ballet',{ts '2012-09-17 18:47:52.69'}, 20, 4, 5, 6,0);
insert into course_trainee (course_id, trainee_id) values (0,4);
insert into cleaner(has_keys, id, pesel, name, surname, cleaner_badge_nr, key_number) values ( 'no',5,'87654567890','cfvgbnhj','imunytr',12345,null );
insert into cleaner (has_keys, id, pesel, name, surname, cleaner_badge_nr, key_number) values ('yes',6,'098765432567','cfvgbnhj','uyhgfds', 76543,43);
insert into receptionist (is_cleaning, id, pesel, name, surname, receptionist_badge_nr, cleaner_badge_nr) values ('no', 7, '34567654378','cfvgbnhj','juhygtfred',4567,456);