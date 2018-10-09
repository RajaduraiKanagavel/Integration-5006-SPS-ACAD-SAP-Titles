create table sap_sequencenumber
(
   InterfaceName varchar(30) not null,
   Region varchar(30) not null,
   CurrentSequenceNumber int not null,
   primary key(InterfaceName, Region)
);

create table tbl_metadata_titles_ismformat
(
   BiblioFormatIdentifier varchar(30) not null,
   SAPFormatIdentifier varchar(30) not null
  
);

create table tbl_metadata_bindings
(
   BiblioBinding varchar(30) not null,
   BiblioBindType varchar(30) not null,
   SAPBinding varchar(30) not null
  
);