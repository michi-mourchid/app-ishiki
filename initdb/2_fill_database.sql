INSERT INTO Fields (name, description) VALUES
                                          ('Programming', 'Courses about different programming languages'),
                                          ('Data Science', 'Courses related to data science and analytics'),
                                          ('Web Development', 'Courses covering modern web development technologies'),
                                          ('Artificial Intelligence', 'Courses focused on AI and machine learning techniques'),
                                          ('Cloud Computing', 'Courses about cloud platforms and services'),
                                          ('Cybersecurity', 'Courses on how to protect systems from digital threats'),
                                          ('Mobile Development', 'Courses for building mobile apps on iOS and Android'),
                                          ('Game Development', 'Courses related to game design and development'),
                                          ('Networking', 'Courses covering computer networking and protocols'),
                                          ('DevOps', 'Courses about CI/CD, automation, and infrastructure as code');
INSERT INTO Courses (name, content, field_id) VALUES
                                                 ('Java Basics', 'Learn the basics of Java programming', 1),
                                                 ('Advanced Python', 'Deep dive into Python programming for data science', 2),
                                                 ('HTML & CSS', 'Foundations of web development with HTML and CSS', 3),
                                                 ('Deep Learning with TensorFlow', 'Master deep learning using TensorFlow', 4),
                                                 ('AWS Cloud Practitioner', 'Introduction to AWS cloud services', 5),
                                                 ('Introduction to Ethical Hacking', 'Learn the basics of ethical hacking', 6),
                                                 ('Building Android Apps', 'Create Android apps using Kotlin', 7),
                                                 ('Unity Game Development', 'Learn to build games with Unity', 8),
                                                 ('Networking Fundamentals', 'Understand basic networking concepts and protocols', 9),
                                                 ('DevOps with Jenkins', 'Master DevOps practices using Jenkins', 10);
INSERT INTO Cards (title, content, img, course_id) VALUES
                                                      ('Java Syntax Overview', 'Learn the basic syntax of Java programming.', NULL, 1),
                                                      ('Object-Oriented Programming in Java', 'Explore OOP concepts in Java.', NULL, 1),
                                                      ('Python Data Structures', 'Understand lists, dictionaries, and sets in Python.', NULL, 2),
                                                      ('Python for Data Science', 'Learn how to use Python for data analysis.', NULL, 2),
                                                      ('HTML Basics', 'Understand the structure of HTML pages.', NULL, 3),
                                                      ('CSS Flexbox', 'Learn how to use Flexbox to create responsive designs.', NULL, 3),
                                                      ('Introduction to TensorFlow', 'Get started with deep learning using TensorFlow.', NULL, 4),
                                                      ('AWS EC2 Setup', 'Learn how to set up EC2 instances in AWS.', NULL, 5),
                                                      ('Penetration Testing Basics', 'Learn the steps of penetration testing.', NULL, 6),
                                                      ('Building Your First Android App', 'Create a basic Android app using Android Studio.', NULL, 7);
INSERT INTO Users (username, password, first_name, last_name, email, role, subscription_type) VALUES
                                                                                                 ('johndoe', 'password123', 'John', 'Doe', 'johndoe@example.com', 'user', 'premium'),
                                                                                                 ('janedoe', 'password456', 'Jane', 'Doe', 'janedoe@example.com', 'user', 'free'),
                                                                                                 ('alicew', 'password789', 'Alice', 'Walker', 'alicew@example.com', 'user', 'premium'),
                                                                                                 ('bobsmith', 'password987', 'Bob', 'Smith', 'bobsmith@example.com', 'admin', 'premium'),
                                                                                                 ('charlieb', 'password654', 'Charlie', 'Brown', 'charlieb@example.com', 'user', 'free'),
                                                                                                 ('davids', 'password321', 'David', 'Stone', 'davids@example.com', 'user', 'premium'),
                                                                                                 ('emilyj', 'passwordabc', 'Emily', 'Jones', 'emilyj@example.com', 'user', 'free'),
                                                                                                 ('frankr', 'passwordxyz', 'Frank', 'Reed', 'frankr@example.com', 'user', 'premium'),
                                                                                                 ('graceh', 'passworddef', 'Grace', 'Hall', 'graceh@example.com', 'user', 'free'),
                                                                                                 ('henryk', 'passwordghi', 'Henry', 'King', 'henryk@example.com', 'user', 'premium');
