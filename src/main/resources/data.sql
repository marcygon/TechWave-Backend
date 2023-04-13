--categories
INSERT
INTO
  categories
  (name)
VALUES
  ('social');
INSERT
INTO
  categories
  (name)
VALUES
  ('presentation');

--events
INSERT
INTO
  events
  (name, organitzer, `description`, highlights, img, location, event_date, event_hour, category_id)
VALUES
  ('test1', 'by tester', 'description', 0, '', 'hola', '2023-04-13', '13:00:00', 1);