-- Create Contact Table
CREATE TABLE IF NOT EXISTS contacts (
                                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        name VARCHAR(255) NOT NULL,
                                        email VARCHAR(255) NOT NULL,
                                        user_type VARCHAR(50) NOT NULL,
                                        subject VARCHAR(255) NOT NULL,
                                        message TINYTEXT NOT NULL,
                                        status VARCHAR(20) DEFAULT 'NEW' NOT NULL,
                                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
                                        created_by VARCHAR(20) NOT NULL,
                                        updated_at TIMESTAMP DEFAULT NULL,
                                        updated_by VARCHAR(20) DEFAULT NULL
);