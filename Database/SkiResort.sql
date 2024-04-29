-- database name: SkiResort
BEGIN TRANSACTION;

DROP TABLE IF EXISTS customer_pass, us_ski_resort, ski_resort_pass, ski_pass CASCADE;

CREATE TABLE customer_pass(
	customer_pass_id serial,
	first_name varchar(100) NOT NULL,
	last_name varchar(100) NOT NULL,
	email varchar(100) NOT NULL,
	phone_number varchar(10),
   CONSTRAINT PK_customer_pass_id PRIMARY KEY (customer_pass_id)
);

CREATE TABLE us_ski_resort(
    ski_resort_id serial,
    name varchar(50) NOT NULL,
    state_name varchar(50) NOT NULL,
    region varchar (50) NOT NULL,
	customer_pass_id int,
    CONSTRAINT pk_ski_resort_ski_resort_id PRIMARY KEY(ski_resort_id),
	CONSTRAINT fk_customer_pass_id FOREIGN KEY (customer_pass_id) REFERENCES customer_pass(customer_pass_id)
);

CREATE TABLE ski_pass(
    pass_id int NOT NULL,
    pass_name varchar (50) NOT NULL,
    CONSTRAINT PK_pass_id PRIMARY KEY (pass_id)
);

CREATE TABLE ski_resort_pass(
    ski_resort_id int NOT NULL,
    pass_id int NOT NULL,
    CONSTRAINT PK_ski_pass PRIMARY KEY (pass_id, ski_resort_id),
    CONSTRAINT fk_ski_resort_id FOREIGN KEY (ski_resort_id) REFERENCES us_ski_resort(ski_resort_id),
    CONSTRAINT fk_pass_id FOREIGN KEY (pass_id) REFERENCES ski_pass(pass_id)
);


INSERT INTO us_ski_resort(name, state_name, region)
                     --IKON Pass
--West Region
VALUES ('Palisades Tahoe','California', 'West'),
('Mammoth Mountain', 'California', 'West'),
('June Mountain', 'California','West'),
('Big Bear Mountain', 'California','West'),
('Snow Valley','California','West'),

--Pacific Northwest region
('Sun Valley', 'Idaho','Pacific Northwest'),
('Alyeska Resort', 'Alaska', 'Pacific Northwest'),
('Crystal Mountain', 'Washington', 'Pacific Northwest'),
('The Summit at Snoqualmie', 'Washington', 'Pacific Northwest'),
('Mount Bachelor', 'Oregon', 'Pacific Northwest'),
('Schweitzer','Idaho','Pacific Northwest'),

--Rockies Region
('Aspen Snowmass','Colorado', 'Rockies'),
('Steamboat', 'Colorado', 'Rockies'),
('Winter Park', 'Colorado', 'Rockies'),
('Copper Mountain','Colorado', 'Rockies'),
('Arapahoe Basin','Colorado', 'Rockies'),
('Eldora Mountain','Colorado', 'Rockies'),
('Jackson Hole', 'Wyoming', 'Rockies'),
('Big Sky', 'Montana', 'Rockies'),
('Taos', 'New Mexico', 'Rockies'),
('Deer Valley', 'Utah','Rockies'),
('Solitude', 'Utah','Rockies'),
('Brighton','Utah','Rockies'),
('Alta','Utah','Rockies'),
('Snowbird','Utah','Rockies'),
('Snowbasin','Utah','Rockies'),

--Midwest Region
('The Highlands','Michigan', 'Midwest'),
('Boyne Mountain','Michigan', 'Midwest'),

              --EPIC Pass
--West Region 29
('Heavenly', 'California', 'West'),
('Northstar','California', 'West'),
('Kirkwood','California', 'West'),
('Stevens Pass', 'Washington', 'West'),

--Rockies Region
('Vail', 'Colorado', 'Rockies'),
('Beaver Creek', 'Colorado', 'Rockies'),
('Breckenridge', 'Colorado', 'Rockies'),
('Keystone', 'Colorado', 'Rockies'),
('Crested Butte','Colorado', 'Rockies'),
('Park City','Utah', 'Rockies'),
('Telluride', 'Colorado', 'Rockies'),

--Northeast Region
('Stowe','Vermont', 'Northeast'),
('Okemo', 'Vermont', 'Northeast'),
('Mount Snow', 'Vermont','Northeast'),
('Mount Sunapee', 'New Hampshire', 'Northeast'),
('Attitash Mountain Resort', 'New Hampshire', 'Northeast'),
('Wildcat Mountain', 'New Hampshire', 'Northeast'),
('Crotched Mountain', 'New Hampshire', 'Northeast'),
('Hunter Mountain', 'New York', 'Northeast'),

--MidAtlantic Region
('Liberty Mountain','Pennsylvania', 'MidAtlantic'),
('Roundtop Mountain','Pennsylvania', 'MidAtlantic'),
('Whitetail Resort','Pennsylvania', 'MidAtlantic'),
('Jack Frost','Pennsylvania', 'MidAtlantic'),
('Big Boulder','Pennsylvania', 'MidAtlantic'),
('Seven Springs','Pennsylvania', 'MidAtlantic'),
('Laurel Mountain','Pennsylvania', 'MidAtlantic'),
('Hidden Valley','Pennsylvania', 'MidAtlantic'),

--Midwest Region
('Afton Alps', 'Minnesota', 'Midwest'),
('Mt Brighton','Michigan','Midwest'),
('Wilmot','Wisconsin','Midwest'),
('Alpine Valley', 'Ohio', 'Midwest'),
('Boston Mills', 'Ohio', 'Midwest'),
('Brandywine', 'Ohio', 'Midwest'),
('Mad River Mountain', 'Ohio', 'Midwest'),
('Hidden Valley', 'Missouri', 'Midwest'),
('Snow Creek', 'Missouri', 'Midwest'),
('Paoli Peaks', 'Indiana', 'Midwest'),

                --Mountain Collective Pass
--All Region
('Alta','Utah','Rockies'),
('Arapahoe Basin','Colorado', 'Rockies'),
('Aspen Snowmass','Colorado', 'Rockies'),
('Big Sky', 'Montana', 'Rockies'),
('Grand Targhee','Wyoming', 'Rockies'),
('Jackson Hole', 'Wyoming', 'Rockies'),
('Snowbasin','Utah','Rockies'),
('Snowbird','Utah','Rockies'),
('Sugar Bowl','California', 'West'),
('Sugarloaf Mountain', 'Maine', 'MidAtlantic'),
('Sun Valley', 'Idaho','Pacific Northwest'),
('Taos', 'New Mexico', 'Rockies');

INSERT INTO ski_pass (pass_name, pass_id)
VALUES
('Ikon', 1),
('Epic', 2),
('Mountain Collective', 3);

INSERT INTO ski_resort_pass (pass_id, ski_resort_id)
VALUES
--IKON PASS/Resorts
(1,1),
(1,2),
(1,3),
(1,4),
(1,5),
(1,6),
(1,7),
(1,8),
(1,9),
(1,10),
(1,11),
(1,12),
(1,13),
(1,14),
(1,15),
(1,16),
(1,17),
(1,18),
(1,19),
(1,20),
(1,21),
(1,22),
(1,23),
(1,24),
(1,25),
(1,26),
(1,27),
(1,28),

--EPIC Pass/Resorts 29-65
(2,29),
(2,30),
(2,31),
(2,32),
(2,33),
(2,34),
(2,35),
(2,36),
(2,37),
(2,38),
(2,39),
(2,40),
(2,41),
(2,42),
(2,43),
(2,44),
(2,45),
(2,46),
(2,47),
(2,48),
(2,49),
(2,50),
(2,51),
(2,52),
(2,53),
(2,54),
(2,55),
(2,56),
(2,57),
(2,58),
(2,59),
(2,60),
(2,61),
(2,62),
(2,63),
(2,64),
(2,65),

--Mountain Collective
(3,66),
(3,67),
(3,68),
(3,69),
(3,70),
(3,71),
(3,72),
(3,73),
(3,74),
(3,75),
(3,76),
(3,77);

INSERT INTO customer_pass (first_name, last_name, email, phone_number)
VALUES
('Josh', 'Parker', 'jparker@gmail.com', '3309871234'),
('Rachel', 'Smith', 'RachelS@gmail.com', '2069875643'),
('Emily', 'Bennett', 'skier101@gmail.com','2164539806'),
('Chris', 'Ryder', 'Ryder@gmail.com', '3308772563'),
('Danielle', 'Jones', 'dannyjones@gmail.com', '2062347549');


COMMIT;