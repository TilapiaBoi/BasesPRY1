﻿CREATE TABLE [dbo].[PROVEEDOR]
(
	[ID] INT NOT NULL IDENTITY, 
	[NOMBRE] VARCHAR(50) NOT NULL, 
    [NOMBRE_CONTACTO] VARCHAR(50) NOT NULL,
    [DIRECCION] VARCHAR(50) NOT NULL, 
    [CIUDAD] VARCHAR(50) NOT NULL,
    CONSTRAINT AK_PROV UNIQUE (NOMBRE),
    CONSTRAINT PK_PROV PRIMARY KEY (ID)
)
