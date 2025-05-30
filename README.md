# File Structure
```
PALM/
├── frontend/
│   ├── index.html
│   ├── package.json
│   ├── vite.config.js
│   ├── public/
│   │   └── user_study/
│   │       ├── programs.json     # Preloaded Programs for User Study
│   │       └── programs_full.json
│   └── src/
│       ├── App.vue
│       ├── main.js
│       ├── config.js
│       ├── components/
│       │   ├── Main.vue         # Main Page
│       │   └── icons/
│       └── assets/
├── backend/
│   ├── app.py                  # Backend Flask App
│   ├── requirements.txt
│   └── PALM/
```

# Setup and Running using Docker

## Set Environment Variable:
In the backend folder, create a `.env` file

Set OpenAI API Key by adding this line:

`OPENAI_API_KEY=Replace_with_actual_key`



## Start:
```docker compose up --build```

may take a while, stretch

Then visit
http://localhost:5173

## Stop: 
Use **Ctrl+C**

Stops and removes containers and network, but keeps volumes.

```docker compose down```

[//]: # (# Install on local machine)
[//]: # (## Backend)

[//]: # (Assuming python3.13 is already installed)

[//]: # ()
[//]: # (```)

[//]: # (cd backend)

[//]: # (python3.13 -m venv .venv)

[//]: # (. .venv/bin/activate)

[//]: # (pip install -r requirements.txt)

[//]: # (```)

[//]: # ()
[//]: # (## Frontend)

[//]: # (Assuming Node.js is installed)

[//]: # ()
[//]: # (cd into the frontend folder)

[//]: # ()
[//]: # (install packages and dependencies)

[//]: # ()
[//]: # (```)

[//]: # (cd frontend)

[//]: # (python3.13 -m venv .venv)

[//]: # (. .venv/bin/activate)

[//]: # (npm install)

[//]: # (```)

[//]: # ()
[//]: # (# Start Using)

[//]: # (Start two terminals )

[//]: # ()
[//]: # (## Backend)

[//]: # ()
[//]: # (```)

[//]: # (cd backend)

[//]: # (# . .venv/bin/activate)

[//]: # (flask --app app run)

[//]: # (```)

[//]: # ()
[//]: # (## Frontend)

[//]: # ()
[//]: # (```)

[//]: # (cd frontend)

[//]: # (# . .venv/bin/activate)

[//]: # (npm run dev)

[//]: # (```)

[//]: # ()
