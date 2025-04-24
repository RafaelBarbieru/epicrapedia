-- User postgres
DO
$$
    BEGIN
        IF NOT EXISTS (SELECT FROM pg_roles WHERE rolname = 'postgres') THEN
            CREATE ROLE postgres WITH LOGIN PASSWORD 'postgres';
        END IF;
    END
$$;

-- User epicrapedia
DO
$$
    BEGIN
        IF NOT EXISTS (SELECT FROM pg_roles WHERE rolname = 'epicrapedia') THEN
            CREATE ROLE epicrapedia WITH LOGIN PASSWORD 'epicrapedia' CREATEDB;
        END IF;
    END
$$;

-- Database
DO
$$
    BEGIN
        IF NOT EXISTS (SELECT FROM pg_database WHERE datname = 'epicrapedia') THEN
            CREATE DATABASE epicrapedia OWNER epicrapedia;
        END IF;
    END
$$;
