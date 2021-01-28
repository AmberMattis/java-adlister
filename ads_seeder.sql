USE adlister_db;

truncate ads;


INSERT into ads(title, description) VALUE
    ('First ad', 'This is the first ad'),
    ('Second ad', 'This is the second ad'),
    ('Third ad', 'This is the third ad');

SELECT * FROM ads;