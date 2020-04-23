﻿CREATE TABLE [dbo].[PARTE]
(
	[ID] INT NOT NULL PRIMARY KEY IDENTITY, 
    [NOMBRE] VARCHAR(50) NOT NULL, 
    [NOMBRE_FAB] VARCHAR(50) NOT NULL,
    [MARCA] VARCHAR(50) NOT NULL,
    [MODELO_AUTO] VARCHAR(20) NOT NULL, 
    [ANO_AUTO] NCHAR(4) NOT NULL, 
    FOREIGN KEY (NOMBRE_FAB) REFERENCES FAB_PARTES (NOMBRE),
    FOREIGN KEY (MARCA) REFERENCES MARCA (NOMBRE),
    FOREIGN KEY (MODELO_AUTO) REFERENCES AUTOMOVIL (MODELO),
    FOREIGN KEY (ANO_AUTO) REFERENCES AUTOMOVIL (ANO)
)
