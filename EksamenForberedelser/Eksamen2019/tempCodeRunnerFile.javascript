const key = crypto.scryptSync(password, formatSalt("pepper"), 24);
