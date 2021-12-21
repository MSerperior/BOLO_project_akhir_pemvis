CREATE TABLE admin (
	id_admin int PRIMARY KEY,
	nama varchar(50) NOT NULL,
	email varchar(255) NOT NULL,
	password varchar(255) NOT NULL
);

CREATE TABLE riwayat_top_up (
	id_riwayat int PRIMARY KEY,
	id_user int NOT NULL,
	id_admin int NOT NULL,
	jumlah int NOT NULL,
	tanggal_top_up DATETIME NOT NULL
);

CREATE TABLE user (
	id_user int PRIMARY KEY,
	nama varchar(50) NOT NULL,
	email varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
	saldo int NOT NULL
);

CREATE TABLE rental (
	id_rental int PRIMARY KEY,
	id_user int NOT NULL,
	id_lapangan int NOT NULL,
	durasi int NOT NULL,
	waktu_pemesanan DATETIME NOT NULL,
	waktu_mulai DATETIME NOT NULL,
	total_pembayaran int NOT NULL
);

CREATE TABLE lapangan (
	id_lapangan int PRIMARY KEY,
	id_jenis_lapangan int NOT NULL,
	nama_lapangan varchar(255) NOT NULL,
	harga_per_jam int NOT NULL
);

CREATE TABLE jenis_lapangan (
	id_jenis_lapangan int PRIMARY KEY,
	jenis_lapangan varchar(50) NOT NULL
);

CREATE TABLE gambar (
	id_gambar int PRIMARY KEY,
	id_lapangan int NOT NULL,
	url_gambar varchar(255) NOT NULL
);

ALTER TABLE riwayat_top_up
ADD FOREIGN KEY (id_user) REFERENCES user(id_user);

ALTER TABLE riwayat_top_up
ADD FOREIGN KEY (id_admin) REFERENCES admin(id_admin);

ALTER TABLE rental
ADD FOREIGN KEY (id_user) REFERENCES user(id_user);

ALTER TABLE rental
ADD FOREIGN KEY (id_lapangan) REFERENCES lapangan(id_lapangan);

ALTER TABLE lapangan
ADD FOREIGN KEY (id_jenis_lapangan) REFERENCES jenis_lapangan(id_jenis_lapangan);

ALTER TABLE gambar
ADD FOREIGN KEY (id_lapangan) REFERENCES lapangan(id_lapangan);