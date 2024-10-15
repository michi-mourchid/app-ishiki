-- Table Field
CREATE TABLE IF NOT EXISTS Fields (
                                     id SERIAL PRIMARY KEY,
                                     name VARCHAR(255) NOT NULL,
                                     description TEXT,
                                     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- Table Course
CREATE TABLE IF NOT EXISTS Courses (
                                      id SERIAL PRIMARY KEY,
                                      name VARCHAR(255) NOT NULL,
                                      content TEXT,
                                      field_id INT,
                                      created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                      FOREIGN KEY (field_id) REFERENCES Fields(id) ON DELETE SET NULL
);

-- Table Card
CREATE TABLE IF NOT EXISTS Cards (
                                    id SERIAL PRIMARY KEY,
                                    title VARCHAR(255) NOT NULL,
                                    content TEXT,
                                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                    img VARCHAR(255),
                                    course_id INT,
                                    FOREIGN KEY (course_id) REFERENCES Courses(id) ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS Users (
                                    id SERIAL PRIMARY KEY,
                                    username VARCHAR(255) UNIQUE NOT NULL,
                                    password VARCHAR(255) NOT NULL,
                                    first_name VARCHAR(255),
                                    last_name VARCHAR(255),
                                    email VARCHAR(255) UNIQUE NOT NULL,
                                    role VARCHAR(50),
                                    subscription_type VARCHAR(50),
                                    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);