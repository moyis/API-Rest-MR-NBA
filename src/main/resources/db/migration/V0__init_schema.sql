CREATE TABLE game
(
    id                 UUID   NOT NULL DEFAULT gen_random_uuid(),
    date               VARCHAR(255) NOT NULL,
    season             INT          NOT NULL,
    status             VARCHAR(255) NOT NULL,
    period           INT          NOT NULL,
    time               VARCHAR(255) NOT NULL,
    postseason         BOOLEAN       NOT NULL,
    home_team_score    INT          NOT NULL,
    visitor_team_score INT          NOT NULL,
    home_team_id      UUID   NOT NULL,
    visitor_team_id    UUID   NOT NULL,
    CONSTRAINT pk_game PRIMARY KEY (id)
);

CREATE TABLE player
(
    id            UUID   NOT NULL DEFAULT gen_random_uuid(),
    first_name    VARCHAR(255) NOT NULL,
    last_name     VARCHAR(255) NOT NULL,
    position      VARCHAR(255) NOT NULL,
    height        VARCHAR(255) NOT NULL,
    weight        VARCHAR(255) NOT NULL,
    jersey_number VARCHAR(255) NOT NULL,
    college       VARCHAR(255) NOT NULL,
    country       VARCHAR(255) NOT NULL,
    draft_year    INT          NOT NULL,
    draft_round   INT          NOT NULL,
    draft_number  INT          NOT NULL,
    team_id       UUID   NOT NULL,
    CONSTRAINT pk_player PRIMARY KEY (id)
);

CREATE TABLE team
(
    id           UUID   NOT NULL DEFAULT gen_random_uuid(),
    abbreviation VARCHAR(255) NOT NULL,
    city         VARCHAR(255) NOT NULL,
    conference   VARCHAR(255) NOT NULL,
    division     VARCHAR(255) NOT NULL,
    full_name    VARCHAR(255) NOT NULL,
    name         VARCHAR(255) NOT NULL,
    CONSTRAINT pk_team PRIMARY KEY (id)
);

ALTER TABLE game
    ADD CONSTRAINT FK_GAME_ON_HOME_TEAM FOREIGN KEY (home_team_id) REFERENCES team (id);

ALTER TABLE game
    ADD CONSTRAINT FK_GAME_ON_VISITOR_TEAM FOREIGN KEY (visitor_team_id) REFERENCES team (id);

ALTER TABLE player
    ADD CONSTRAINT FK_PLAYER_ON_TEAM FOREIGN KEY (team_id) REFERENCES team (id);




