INSERT INTO `admin` (`id_admin`, `nama`, `email`, `password`) VALUES
(1001, 'Ilsa Agustina', 'ilsaagustina@gmail.com', 'ilsa123'),
(1002, 'Vivi aryani', 'viviaryani@gmail.com', 'vivi12345'),
(1003, 'Vera Rahayu', 'verayu44@gmail.com', 'vera1234'),
(1004, 'Ivan Maulana', 'ivan767@yahoo.com', 'ivan54321'),
(1005, 'Test Admin', 'test@gmail.com', '123');

INSERT INTO `jenis_lapangan` (`id_jenis_lapangan`, `jenis_lapangan`) VALUES
(1010, 'Lapangan Futsal'),
(1020, 'Lapangan Voli '),
(1030, 'Lapangan Basket'),
(1040, 'Lapangan Badminton');

INSERT INTO `user` (`id_user`, `nama`, `email`, `password`, `saldo`) VALUES
(101, 'Rahmat Hidayanto', 'Rahmat01@yahoo.com', 'rahmat111', 50000),
(102, 'Yosef Santoso', 'yosefsanto@yahoo.com', 'yosef12345', 65000),
(103, 'Okta Mustofa', 'oktamustofa02@gmail.com', 'mustofa123', 75000),
(104, 'Pranata Sinaga', 'sinaga45@gmail.com', 'sinaga54321', 90000),
(105, 'Latif Putra', 'latif30@yahoo.com', 'latif1212', 30000),
(106, 'Umar Narpati', 'umarnarpati@yahoo.com', 'narpati123', 76000),
(107, 'Cahyo Budiyanto', 'cahyo77@gmail.com', 'cahyo123', 47000),
(108, 'Teguh Wahyudi', 'Teguh80@gmail.com', 'Teguh2828', 83000),
(109, 'Radit Ardiyanto', 'Aridyantoradit@yahoo.com', 'radit1111', 85000),
(110, 'Panji Adriansyah', 'Panjiadri18@gmail.com', 'panji1818', 68000),
(111, 'Ira Fujiati', 'Fujiati99@yahoo.com', 'fujiati12345', 33000),
(112, 'Siska Permata', 'siska122@gmail.com', 'siska212', 38000),
(113, 'Cindy Utami', 'cindyutami66@gmail.com', 'cindy1234', 42000),
(114, 'Test User', 'test@gmail.com', '123', 0);

INSERT INTO `lapangan` (`id_lapangan`, `id_jenis_lapangan`, `nama_lapangan`, `harga_per_jam`) VALUES
(11, 1010, 'Lapangan A', 50000),
(12, 1010, 'Lapangan B', 75000),
(13, 1020, 'Lapangan C', 100000),
(14, 1020, 'Lapangan D', 125000),
(15, 1030, 'Lapangan E', 175000),
(16, 1030, 'Lapangan F', 200000),
(17, 1040, 'Lapangan G', 15000),
(18, 1040, 'Lapangan H', 30000);

INSERT INTO `rental` (`id_rental`, `id_user`, `id_lapangan`, `durasi`, `waktu_pemesanan`, `waktu_mulai`, `total_pembayaran`) VALUES
(111, 107, 11, 2, '2021-12-22 04:30:28', '2021-12-23 09:00:00', 100000),
(112, 113, 13, 2, '2021-12-21 20:00:00', '2021-12-22 16:00:00', 200000),
(113, 104, 16, 3, '2021-12-24 10:00:00', '2021-12-25 15:00:00', 600000),
(114, 112, 18, 2, '2021-12-23 07:00:00', '2021-12-24 20:00:00', 60000);

INSERT INTO `riwayat_top_up` (`id_riwayat`, `id_user`, `id_admin`, `jumlah`, `tanggal_top_up`) VALUES
(100, 107, 1001, 100000, '2021-12-21 10:00:00'),
(200, 113, 1004, 200000, '2021-12-21 09:08:24'),
(300, 104, 1003, 700000, '2021-12-24 10:41:06'),
(400, 112, 1002, 22000, '2021-12-24 10:10:39');


INSERT INTO `gambar` (`id_gambar`, `id_lapangan`, `url_gambar`) VALUES
(1, 11, '/user/images/Lapangan_A.jpg'),
(2, 12, '/user/images/Lapangan_B.jpg'),
(3, 13, '/user/images/Lapangan_C.jpg'),
(4, 14, '/user/images/Lapangan_D.jpg'),
(5, 15, '/user/images/Lapangan_E.jpg'),
(6, 16, '/user/images/Lapangan_F.jpg'),
(7, 17, '/user/images/Lapangan_G.jpg'),
(8, 18, '/user/images/Lapangan_H.png');