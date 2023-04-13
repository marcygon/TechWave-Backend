--categories
INSERT
INTO
  categories
  (name)
VALUES
  ('Bussines');
INSERT
INTO
  categories
  (name)
VALUES
  ('Cultural');
INSERT
INTO
  categories
  (name)
VALUES
  ('Educational');
INSERT
INTO
  categories
  (name)
VALUES
  ('Social');
INSERT
INTO
  categories
  (name)
VALUES
  ('Sports');

--events
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Technology conference', 'Eventia', 'A business event that brings together experts and professionals in the technology industry to discuss relevant and current topics related to technology. It is an opportunity to learn and share knowledge, establish contacts, and do business. Technology conferences usually take place in convention centers and can last from one to several days, with a full program of talks, workshops, and networking sessions.', 0, 'no', 'California', '2023-04-26', '12:30:00', 1);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Consumer electronics fair', 'Eventia', 'A business event that focuses on the exhibition of consumer electronics products, such as smartphones, televisions, sound systems, and other devices. Consumer electronics fairs usually take place in large convention centers and attract visitors from around the world who want to know the latest trends and products in technology.', 0, 'no', 'New York', '2023-04-30', '12:00:00', 1);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Video game festival', 'Eventia', 'A cultural event that celebrates the culture of video games and brings together players, developers, and fans from around the world. It is an opportunity to learn about the latest trends in video games, participate in tournaments and competitions, and meet other players and fans. Video game festivals can last from a few days to several weeks and are held in convention centers and other large venues.', 0, 'no', 'Texas', '2023-05-01', '12:00:00', 2);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Virtual reality film screening', 'Eventia', 'A cultural event that allows viewers to experience films in virtual reality. It is an opportunity to explore different virtual worlds and scenarios and enjoy a unique and immersive cinema experience. Virtual reality film screenings are held in specific locations that have the necessary equipment to offer this experience, such as virtual reality centers.', 0, 'no', 'Texas', '2023-05-01', '18:00:00', 2);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Hackathon', 'Eventia', 'An educational event where participants work together in teams to develop innovative technological solutions within a limited time frame. It is an opportunity to learn, experiment, and create technological projects as a team. Hackathons can last from one day to one week and are held at innovation centers, universities, and other similar locations.', 0, 'no', 'California', '2023-05-13', '18:00:00', 3);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Programming workshop', 'Eventia', 'An educational event where participants learn how to program and develop skills in technology. Programming workshops can be of different levels, from beginners to advanced, and can focus on different programming languages and technological tools. These workshops are held at training centers, universities, and other similar locations.', 0, 'no', 'New Jersey', '2023-05-20', '18:00:00', 3);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Technology meetup', 'Eventia', 'A social event where technology professionals and enthusiasts gather to share their interests, projects, and knowledge. Technology meetups can focus on different topics such as artificial intelligence, virtual reality, or cybersecurity, and can include talks, debates, and networking sessions. These events are usually held at bars, cafes, and other informal locations.', 0, 'no', 'New Jersey', '2023-05-20', '18:00:00', 4);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Product launch party', 'Eventia', 'A social event where a company or startup celebrates the launch of a new technological product or service. It is an opportunity to introduce the product, generate interest, and build relationships with customers and other stakeholders in the industry. Product launch parties can be formal or informal and are held at exclusive locations or at the companys headquarters.', 1, 'no', 'Alabama', '2023-03-20', '10:00:00', 4);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('eSports competition', 'Riot', 'A sports event where players compete in online video games. It is an opportunity to demonstrate skills in popular games such as League of Legends, Fortnite, or Call of Duty and to win prizes and recognition in the world of video games. eSports competitions can be online or live, and are held at convention centers and other large venues.', 1, 'no', 'Wisconsin', '2023-05-20', '10:00:00', 5);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Technology marathon', 'Eventia', 'A sports event where participants run a race while developing an application or a technological project in real-time. It is an opportunity to combine sports and technology, and to foster creativity and teamwork. Technology marathons can last from one day to one week and are held at similar locations such as innovation centers or universities.', 0, 'no', 'Wisconsin', '2023-03-01', '20:00:00', 5);
