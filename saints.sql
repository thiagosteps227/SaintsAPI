create database saints;
use saints;

create table saints (
	id int not null auto_increment,
    name varchar (25),
    country varchar(25),
    city varchar(25),
    century int,
    picture varchar(40),
    description varchar(255),
    primary key (id));
    
insert into saints (id, name, country, city, century, picture, description)
values (1, 'Saint Paul', 'Turkey', 'Tarsus','4','stpaul.jpg','Paul the Apostle, was a Christian apostle who spread the teachings of Jesus in the first-century.He founded several Christian communities in Asia Minor and Europe from the mid-30s to the mid-50s AD');

insert into saints (id, name, country, city, century, picture, description)
values (2, 'Saint Patrick', 'Ireland', 'Roman Britain','4','stpatrick.jpg','Saint Patrick was a fifth-century Romano-British Christian missionary and bishop in Ireland. Known as the Apostle of Ireland, he is the primary patron saint of Ireland');

insert into saints (id, name, country, city, century, picture, description)
values (3, 'Our Lady Aparecida', 'Brazil', 'Aparecida','18','ourLadyAparecida.jpg','Lady Aparecida -Our Lady Revealed- is a title of the Blessed Virgin Mary in the traditional form associated with the Immaculate Conception associated with a clay');

insert into saints (id, name, country, city, century, picture, description)
values (4, 'Saint Benedict', 'Italy', 'Nursia','5','stbenedict.jpg','Benedict of Nursia is a Christian saint venerated in the Catholic Church, the Eastern Orthodox Church, the Oriental Orthodox Churches, the Anglican Communion and Old Catholic Churches. He is a patron saint of Europe.');

insert into saints (id, name, country, city, century, picture, description)
values (5, 'Saint Anthony', 'Italy', 'Padua','12','stanthony.jpg','Known as Saint Anthony of Padua, He was a Portuguese Catholic priest and friar of the Franciscan Order. He was born and raised by a wealthy family in Lisbon, Portugal, and died in Padua, Italy');

insert into saints (id, name, country, city, century, picture, description)
values (6, 'Saint Thomas Aquinas', 'Italy', 'Aquino','13','stthomasaquinas.jpg','Italian Dominican theologian, the foremost medieval Scholastic. He developed his own conclusions from Aristotelian premises. As a theologian, he was responsible in his two masterpieces: the Summa theologiae and the Summa contra gentiles.');

insert into saints (id, name, country, city, century, picture, description)
values (7, 'Saint Augustine', 'Algeria', 'Hippo','4','staugustine.jpg','Bishop of Hippo, one of the Latin Fathers of the Church and perhaps the most significant Christian thinker after St. Paul. Augustine’s adaptation of classical thought to Christian teaching created a theological system of great power.');

insert into saints (id, name, country, city, century, picture, description)
values (8, 'Saint Catherine', 'Italia', 'Siena','4','stcatherine.jpg','Catherine was the youngest of 25 children born to a lower middle-class family. At a young age she is said to have consecrated her virginity to Christ and experienced mystical visions. Catherine is member of the Dominican Order.');
