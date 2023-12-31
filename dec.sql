PGDMP         '            
    w            DEC    11.5    11.5                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    35044    DEC    DATABASE     �   CREATE DATABASE "DEC" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE "DEC";
             postgres    false            �            1259    35045    admin    TABLE     t   CREATE TABLE public.admin (
    usuario character varying(30) NOT NULL,
    senha character varying(30) NOT NULL
);
    DROP TABLE public.admin;
       public         postgres    false            �            1259    35048    cliente    TABLE     �   CREATE TABLE public.cliente (
    nome character varying(30) NOT NULL,
    idade integer NOT NULL,
    endereco character varying(300) NOT NULL,
    usuario character varying(30) NOT NULL,
    senha character varying(30) NOT NULL
);
    DROP TABLE public.cliente;
       public         postgres    false            �            1259    35051 
   entregador    TABLE     �   CREATE TABLE public.entregador (
    nome character varying(30) NOT NULL,
    idade integer NOT NULL,
    endereco character varying(300) NOT NULL,
    usuario character varying(30) NOT NULL,
    senha character varying(30) NOT NULL
);
    DROP TABLE public.entregador;
       public         postgres    false            �            1259    35054    loja    TABLE     �   CREATE TABLE public.loja (
    cnpj character(30) NOT NULL,
    nome character(30) NOT NULL,
    endereco character(30) NOT NULL,
    usuario character(30) NOT NULL,
    senha character(30) NOT NULL,
    razao_social character(30) NOT NULL
);
    DROP TABLE public.loja;
       public         postgres    false                      0    35045    admin 
   TABLE DATA               /   COPY public.admin (usuario, senha) FROM stdin;
    public       postgres    false    196   l                 0    35048    cliente 
   TABLE DATA               H   COPY public.cliente (nome, idade, endereco, usuario, senha) FROM stdin;
    public       postgres    false    197   �                 0    35051 
   entregador 
   TABLE DATA               K   COPY public.entregador (nome, idade, endereco, usuario, senha) FROM stdin;
    public       postgres    false    198   �       	          0    35054    loja 
   TABLE DATA               R   COPY public.loja (cnpj, nome, endereco, usuario, senha, razao_social) FROM stdin;
    public       postgres    false    199          �
           2606    35058    cliente cliente_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (usuario);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public         postgres    false    197            �
           2606    35060    entregador entregador_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.entregador
    ADD CONSTRAINT entregador_pkey PRIMARY KEY (usuario);
 D   ALTER TABLE ONLY public.entregador DROP CONSTRAINT entregador_pkey;
       public         postgres    false    198            �
           2606    35062    loja loja_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.loja
    ADD CONSTRAINT loja_pkey PRIMARY KEY (cnpj);
 8   ALTER TABLE ONLY public.loja DROP CONSTRAINT loja_pkey;
       public         postgres    false    199               #   x�KL����L�\)�9��y�%��%�\1z\\\ �	}            x�+I-.I5�42�,����b#�=... �~
         5   x�-J�	  {7�������X�r�-F�И~L3T�ӗO�~2���g��{�      	      x�+I-.IU�8KZ��4W� �N �     