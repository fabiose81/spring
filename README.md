# spring
Service REST with Spring Boot, Spring MVC, Spring Data and Hibernate 


CREATE TABLE public.recipe
(
  id integer NOT NULL DEFAULT nextval('recipe_id_seq'::regclass),
  name character varying(250) NOT NULL,
  ingredients text NOT NULL,
  directions text NOT NULL,
  CONSTRAINT pk_id_recipe PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
