const express = require('express');
const app = express();
const { Client, Intents } = require('discord.js');
const client = new Client({ intents: [Intents.FLAGS.GUILDS, Intents.FLAGS.GUILD_MESSAGES] });

const PORT = process.env.PORT || 3000;

// Discord bot logic
const token = add;

client.once('ready', () => {
    console.log('Bot is ready!');
});

// Start the server and login the bot
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
    // Log in the bot when the server starts
    client.login(token);
});

// Endpoint to handle interactions with the bot
app.post('/interact', (req, res) => {
    // This is where you can add code to interact with your Discord bot
    res.status(200).send('Interaction successful');
});

// Serve the HTML file
app.get('/', (req, res) => {
    res.sendFile(__dirname + '/index.html');
});
