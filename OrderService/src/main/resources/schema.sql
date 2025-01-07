CREATE TABLE Orders (
                              id BIGINT AUTO_INCREMENT PRIMARY KEY,
                              product_name VARCHAR(255) NOT NULL,
                              quantity BIGINT NOT NULL,
                              user_email VARCHAR(255) NOT NULL
);
