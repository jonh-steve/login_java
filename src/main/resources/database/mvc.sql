CREATE DATABASE IF NOT EXISTS mydb;
USE mydb;
CREATE TABLE IF NOT EXISTS product (
                                       id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                                       nameProduct VARCHAR(200) NOT NULL,
                                       quantity INT NOT NULL,
                                       price DOUBLE
);
# INSERT INTO `Product` (`nameProduct`, `quantity`, `price`) VALUES
#                                                                ('Tivi', 20, 5000000),
#                                                                ('Tủ lạnh', 30, 4500000),
#                                                                ('Máy giặt', 15, 3000000),
#                                                                ('Điều hòa', 40, 5500000),
#                                                                ('Laptop', 120, 10000000),
#                                                                ('Điện thoại', 150, 20000000),
#                                                                ('Quạt', 50, 800000),
#                                                                ('Bóng điện', 60, 150000),
#                                                                ('Loa', 80, 750000),
#                                                                ('Đồng hồ', 600, 1200000),
#                                                                ('Máy sấy', 200, 90000),
#                                                                ('Bàn là', 620, 650000);
