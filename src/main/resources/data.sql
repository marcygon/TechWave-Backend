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
  ('Technology conference', 'Eventia', 'A business event that brings together experts and professionals in the technology industry to discuss relevant and current topics related to technology. It is an opportunity to learn and share knowledge, establish contacts, and do business. Technology conferences usually take place in convention centers and can last from one to several days, with a full program of talks, workshops, and networking sessions.', 0, 'https://images.unsplash.com/photo-1540575467063-178a50c2df87?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80', 'California', '2023-04-26', '12:30:00', 1);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Consumer electronics fair', 'Eventia', 'A business event that focuses on the exhibition of consumer electronics products, such as smartphones, televisions, sound systems, and other devices. Consumer electronics fairs usually take place in large convention centers and attract visitors from around the world who want to know the latest trends and products in technology.', 0, 'https://images.unsplash.com/photo-1485827404703-89b55fcc595e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80', 'New York', '2023-04-30', '12:00:00', 1);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Video game festival', 'Eventia', 'A cultural event that celebrates the culture of video games and brings together players, developers, and fans from around the world. It is an opportunity to learn about the latest trends in video games, participate in tournaments and competitions, and meet other players and fans. Video game festivals can last from a few days to several weeks and are held in convention centers and other large venues.', 0, 'https://images.unsplash.com/photo-1551103782-8ab07afd45c1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80', 'Texas', '2023-05-01', '12:00:00', 2);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Virtual reality film screening', 'Eventia', 'A cultural event that allows viewers to experience films in virtual reality. It is an opportunity to explore different virtual worlds and scenarios and enjoy a unique and immersive cinema experience. Virtual reality film screenings are held in specific locations that have the necessary equipment to offer this experience, such as virtual reality centers.', 0, 'https://images.unsplash.com/photo-1538388149542-5e24932d11a8?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80', 'Texas', '2023-05-01', '18:00:00', 2);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Hackathon', 'Eventia', 'An educational event where participants work together in teams to develop innovative technological solutions within a limited time frame. It is an opportunity to learn, experiment, and create technological projects as a team. Hackathons can last from one day to one week and are held at innovation centers, universities, and other similar locations.', 0, 'https://images.unsplash.com/photo-1504384308090-c894fdcc538d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80', 'California', '2023-05-13', '18:00:00', 3);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Programming workshop', 'Eventia', 'An educational event where participants learn how to program and develop skills in technology. Programming workshops can be of different levels, from beginners to advanced, and can focus on different programming languages and technological tools. These workshops are held at training centers, universities, and other similar locations.', 0, 'https://images.unsplash.com/photo-1522071820081-009f0129c71c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80', 'New Jersey', '2023-05-20', '18:00:00', 3);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Technology meetup', 'Eventia', 'A social event where technology professionals and enthusiasts gather to share their interests, projects, and knowledge. Technology meetups can focus on different topics such as artificial intelligence, virtual reality, or cybersecurity, and can include talks, debates, and networking sessions. These events are usually held at bars, cafes, and other informal locations.', 0, 'https://images.unsplash.com/photo-1576085898323-218337e3e43c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80', 'New Jersey', '2023-05-20', '18:00:00', 4);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Product launch party', 'Eventia', 'A social event where a company or startup celebrates the launch of a new technological product or service. It is an opportunity to introduce the product, generate interest, and build relationships with customers and other stakeholders in the industry. Product launch parties can be formal or informal and are held at exclusive locations or at the companys headquarters.', 1, 'https://images.unsplash.com/photo-1556761175-5973dc0f32e7?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1032&q=80', 'Alabama', '2023-03-20', '10:00:00', 4);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('eSports competition', 'Riot', 'A sports event where players compete in online video games. It is an opportunity to demonstrate skills in popular games such as League of Legends, Fortnite, or Call of Duty and to win prizes and recognition in the world of video games. eSports competitions can be online or live, and are held at convention centers and other large venues.', 1, 'https://images.unsplash.com/photo-1542751371-adc38448a05e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80', 'Wisconsin', '2023-05-20', '10:00:00', 5);
INSERT
INTO
  events
  (name, organitzer, description, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('Technology marathon', 'Eventia', 'A sports event where participants run a race while developing an application or a technological project in real-time. It is an opportunity to combine sports and technology, and to foster creativity and teamwork. Technology marathons can last from one day to one week and are held at similar locations such as innovation centers or universities.', 0, 'https://images.unsplash.com/photo-1528901166007-3784c7dd3653?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80', 'Wisconsin', '2023-03-01', '20:00:00', 5);
