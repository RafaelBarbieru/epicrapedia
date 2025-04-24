CREATE TABLE battles (
    id          SERIAL PRIMARY KEY,
    title       TEXT NOT NULL,
    lyrics      TEXT NOT NULL,
    uploaded_at TIMESTAMPTZ NOT NULL,
    created_at  TIMESTAMPTZ NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMPTZ
);