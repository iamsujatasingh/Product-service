CREATE TABLE product (
                         id SERIAL PRIMARY KEY,
                         name VARCHAR(100) NOT NULL,
                         description TEXT,
                         price DECIMAL(10, 2) NOT NULL
);
INSERT INTO product (id, name, description, price) VALUES (1, 'Face Cream', 'Hydrating cream for dry skin', 19.99), (2, 'Lip Balm', 'Organic lip balm with SPF', 5.49),(3, 'Shampoo', 'Sulfate-free nourishing shampoo', 12.75),(4, 'Conditioner', 'Repairing conditioner for damaged hair', 13.25),(5, 'Body Lotion', 'Shea butter body lotion', 10.99);