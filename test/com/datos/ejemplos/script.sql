create table tb_familia_formato (id_fformato int(5) primary key auto_increment,nombre_familia text)engine=innodb;
	create table tb_subfamilia_formato (id_sformato int(5) primary key auto_increment,nombre_subfamilia text,
		clave text, id_fformato int(5), FOREIGN KEY (id_fformato) REFERENCES tb_familia_formato(id_fformato) ON DELETE CASCADE ON UPDATE CASCADE)engine=innodb;


		insert into  tb_familia_formato values(null,'ImpreLotto'),
									(null,'Paching & Label'),
									(null,'Formas Comerciales'),
									(null,'Letterme'),
									(null,'Eviden Seal'),
									(null,'Security Label 3D'),
									(null,'Formas Inteligentes'),
									(null,'Hologramas'),
									(null,'DOCU')
									;

		INSERT INTO	tb_subfamilia_formato	VALUES		
			(null,'Billete Tombola','IML-001',1)	,
			(	null,	'Billete de Loteria Instantanea','IML-002',1	)	,
			(	null,	'Billete Trivia','IML-003',1	)	,
			(	null,	'Billete 3 en 1','IML-004',1	)	,
			(	null,	'Billete 2 en 1','IML-005',1	)	,
			(	null,	'Abre la ventana','IML-006',1	)	,
			(	null,	'Suajadito','IML-007',1	)	,
			(	null,	'Win Decoder','IML-008',1	)	,
			(	null,	'Diamond Coupon','IML-009',1	)	,
			(	null,	'Planilla Plus','IML-010',1	)	,
			(	null,	'Planilla Bingo','IML-011',1	)	,
			(	null,	'Sello de seguridad termoformable','P&L-001',2	)	,
			(	null,	'Sello de seguridad termoformable con holograma','P&L-002',2	)	,
			(	null,	'Etiquetas colgantes','P&L-003',2	)	,
			(	null,	'Etiquetas autoadheribles','P&L-004',2	)	,
			(	null,	'Marbetes','P&L-005',2	)	,
			(	null,	'Brazaletes','P&L-006',2	)	,
			(	null,	'Certificado de Autenticidad','P&L-007',2	)	,
			(	null,	'Credencial ','BCD-001',2	)	,
			(	null,	'Gafetes','BCD-002',2	)	,
			(	null,	'Credencial Dua-Lam','BCD-003',2	)	,
			(	null,	'Hoja membretada','FCO-001',3	)	,
			(	null,	'Orden de compra','FCO-002',3	)	,
			(	null,	'Papel Stock','FCO-003',3	)	,
			(	null,	'Orden de Producción','FCO-004',3	)	,
			(	null,	'Remisión','FCO-005',3	)	,
			(	null,	'Folleto','FCO-006',3	)	,
			(	null,	'Diptico','FCO-007',3	)	,
			(	null,	'Triptico','FCO-008',3	)	,
			(	null,	'Recibo','FCO-009',3	)	,
			(	null,	'Eme','LET-001',4	)	,
			(	null,	'Wrapme Sobre NG','LET-002-001',4	)	,
			(	null,	'Wrapme Sobre alto impacto','LET-002-002',4	)	,
			(	null,	'Wrapme Sobre Convencional','LET-002-003',4	)	,
			(	null,	'Foldme Autosobre','LET-003',4	)	,
			(	null,	'Safety Seal evidencia de linea','EVS-001-001',5	)	,
			(	null,	'Safety Seal evidencia Personalizada','EVS-001-002',5	)	,
			(	null,	'Safety Tag evidencia de linea','EVS-002-001',5	)	,
			(	null,	'Safety Tag evidencia Personalizada','EVS-002-002',5	)	,
			(	null,	'Safety Nip evidencia de linea','EVS-003-001',5	)	,
			(	null,	'Safety Nip evidencia Personalizada','EVS-003-002',5	)	,
			(	null,	'Safety Tape evidencia de linea','EVS-004-001',5	)	,
			(	null,	'Safety Tape evidencia Personalizada','EVS-004-002',5	)	,
			(	null,	'Security Label 3D','L3D-001',6	)	,
			(	null,	'Etiqueta para vaso 3D','L3D-002',6	)	,
			(	null,	'Etiquetas 3D','L3D-003',6	)	,
			(	null,	'Boleto de Acceso 3D','L3D-004',6	)	,
			(	null,	'Vaso Promocional 3D','L3D-005',6	)	,
			(	null,	'Formato para Verificación Vehicular','ITG-001',7	)	,
			(	null,	'Formato holograma para transportista','ITG-002',7	)	,
			(	null,	'Formato Control Vehicular (Refrendo y Tenencia)','ITG-003',7	)	,
			(	null,	'Licencia con holograma','ITG-004',7	)	,
			(	null,	'Hologramas de linea','HOL-001',8	)	,
			(	null,	'Hologramas de linea Tamper Evidet','HOL-002',8	)	,
			(	null,	'Hologramas de linea Tamper Evidet Estampado','HOL-003',8	)	,
			(	null,	'Hologramas de Personalizado  aleatorio Tamper Evidet','HOL-004',8	)	,
			(	null,	'Hologramas de Personalizado aleatorio Tamper Evidet Estampado','HOL-005',8	)	,
			(	null,	'Hologramas de Personalizado  a registro Tamper Evidet','HOL-006',8	)	,
			(	null,	'Hologramas de Personalizado   a registro Tamper Evidet Estampado','HOL-007',8	)	,
			(	null,	'Mica holografica de linea transparente','HOL-008',8	)	,
			(	null,	'Mica holografica de linea transparente Tamper Evidet','HOL-009',8	)	,
			(	null,	'Mica holografica de persoanlizada aleatoria  transparente Tamper Evident','HOL-010',8	)	,
			(	null,	'Mica holografica de persoanlizada a registro  transparente Tamper Evident','HOL-011',8	)	,
			(	null,	'Certificados','Doc-001',9	)	,
			(	null,	'Titulos','Doc-002',9	)	,
			(	null,	'Hojas de Seguridad','Doc-003',9	)	,
			(	null,	'Licencias','Doc-004',9	)	,
			(	null,	'Recibos','Doc-005',9	)	,
			(	null,	'Vale de transporte','Doc-006',9	)	,
			(	null,	'Vale de gasolina','Doc-007',9	)	,
			(	null,	'Vale de despensa','Doc-008',9	)	,
			(	null,	'Constancia de no Antecedentes Penales','Doc-009',9	)	,
			(	null,	'Boleto de acceso','Doc-010',9	)	,
			(	null,	'Boleto de estacionamiento','Doc-011',9	)	,
			(	null,	'Tarjetas de Prepago','Doc-012',9	)	,
			(	null,	'Hojas de Servicio Social','Doc-013',9	)	;


create table tb_clinte (id_cleinte int(5) primary key auto_increment, rfc_cliente varchar(40) not null ,Nombre_cliente text, domicilio text, ciudad text, Estado text, telefono text, deptp text, atencion text )engine=innodb;



	ALTER TABLE tb_clinte
		ADD UNIQUE (rfc_cliente); 

create table tb_formas(id_forma int(5) primary key auto_increment, nombre_forma text,ancho text,largo text,
variable char(2),holo char(2),suaje char(2),estam char(2),adhe char(2),lamin char(2), ensobre char(2), embolsa char(2),
id_sformato int(5), FOREIGN KEY (id_sformato) REFERENCES tb_subfamilia_formato(id_sformato) ON DELETE CASCADE ON UPDATE CASCADE,
id_cleinte int(5), FOREIGN KEY (id_cleinte) REFERENCES tb_clinte(id_cleinte) ON DELETE CASCADE ON UPDATE CASCADE
)engine=innodb;


drop PROCEDURE cs_setNforma;
delimiter &&
CREATE PROCEDURE cs_setNforma(nom text,tiem_entr text ,anch text, larg text, agen text, elab text, coti text,opa text ,canti int(100),unidad text,i text, idcli int(5))
BEGIN
Declare id_sf int;
set id_sf = (SELECT id_sformato FROM tb_subfamilia_formato WHERE nombre_subfamilia = i);
INSERT INTO tb_formas VALUES (null,nom,tiem_entr,anch,larg,agen,elab,coti,opa,canti,unidad,id_sf,idcli);
END&&
delimiter ; 

create table  tb_apliformas (id_apF int(5)primary key auto_increment,id_forma int(5),FOREIGN KEY (id_forma) REFERENCES tb_formas(id_forma) ON DELETE CASCADE ON UPDATE CASCADE,id_aplicacion int(5),FOREIGN KEY (id_aplicacion) REFERENCES tb_aplicacionese(id_aplicacion) ON DELETE CASCADE ON UPDATE CASCADE,ancho text, largo text,cantidad text, obserbaciones text,id_cleinte int(5), FOREIGN KEY (id_cleinte) REFERENCES tb_clinte(id_cleinte) ON DELETE CASCADE ON UPDATE CASCADE )engine=innodb;


CREATE table tb_op(id_op int(5) primary key auto_increment,no_prod text, tipo_op text, f_registro date, f_autorizacion date,f_produccion date, f_cliente date, id_forma int(5),status text ,FOREIGN KEY (id_forma) REFERENCES tb_formas(id_forma) ON DELETE CASCADE ON UPDATE CASCADE )engine=innodb;

drop PROCEDURE cs_setAP;
delimiter $
CREATE PROCEDURE cs_setAP(iform int,clave int,des text, anc text, lar text, cant text, obs text,clie text)
BEGIN
Declare icli int;
set icli =(SELECT id_cleinte FROM tb_clinte WHERE Nombre_cliente = clie);
insert into tb_apliformas values(null,iform,clave,des,anc,lar,cant,obs,icli);
	insert into tb_op (id_forma,status) values(iform,"Por autorizar");
END$$
delimiter ;



select  Nombre_cliente, Tiempo_entrega, nombre_familia, nombre_subfamilia, tb_subfamilia_formato.clave,status
from tb_clinte 
 inner join tb_formas on tb_clinte.id_cleinte=tb_formas.id_cleinte
 inner join tb_subfamilia_formato on tb_formas.id_sformato = tb_subfamilia_formato.id_sformato
 inner join tb_familia_formato on tb_subfamilia_formato.id_fformato =tb_familia_formato.id_fformato
