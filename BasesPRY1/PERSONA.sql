﻿CREATE TABLE [dbo].[PERSONA]
(
    [CEDULA] NCHAR(9) NOT NULL,
    CHECK (LEN(CEDULA) = 9),
    [NOMBRE] VARCHAR(50) NOT NULL, 
    [DIRECCION] VARCHAR(50) NOT NULL, 
    [CIUDAD] VARCHAR(50) NOT NULL, 
    [ID_CLIENTE] INT NOT NULL, 
    FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTE (ID)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    PRIMARY KEY CLUSTERED ([CEDULA] ASC)
)
