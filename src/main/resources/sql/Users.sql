-- Create Users Table
CREATE TABLE IF NOT EXISTS users (
                                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                     name VARCHAR(255) NOT NULL,
                                     email VARCHAR(255) NOT NULL UNIQUE,
                                     password_hash VARCHAR(500) NOT NULL,
                                     mobile_number VARCHAR(20) UNIQUE,
                                     role_id BIGINT NOT NULL,
                                     company_id BIGINT NULL,
                                     created_at    TIMESTAMP   DEFAULT CURRENT_TIMESTAMP NOT NULL,
                                     created_by    VARCHAR(20)  NOT NULL,
                                     updated_at    TIMESTAMP   DEFAULT NULL,
                                     updated_by    VARCHAR(20) DEFAULT NULL,
                                     CONSTRAINT fk_users_role FOREIGN KEY (role_id) REFERENCES roles(id),
                                     CONSTRAINT fk_users_company FOREIGN KEY (company_id) REFERENCES companies(id) ON DELETE SET NULL
);