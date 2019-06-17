insert into user(account, password, username, email) values
('user1', '1234', 'test1', 'user1@dgsw.hs.kr'),
('user2', password('1234'), 'test2', 'user2@dgsw.hs.kr'),
('user3', password('1234'), 'test3', 'user3@dgsw.hs.kr'),
('user4', password('1234'), 'test4', 'user4@dgsw.hs.kr'),
('user5', password('1234'), 'test5', 'user5@dgsw.hs.kr'),
('user6', password('1234'), 'test6', 'user6@dgsw.hs.kr');

insert into post(user_id, title, content) value
(1, 'title 1', 'content 1'),
(1, 'title 2', 'content 2'),
(1, 'title 3', 'content 3'),
(2, 'title 4', 'content 4'),
(3, 'title 5', 'content 5');