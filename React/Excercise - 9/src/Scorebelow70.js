import React from "react";

function Scorebelow70(props) {

    const lowScorePlayers = props.players.filter(
        player => player.score < 70
    );

    return (
        <div>
            {lowScorePlayers.map((item, index) => (
                <div key={index}>
                    <li>
                        Mr. {item.name} <span>{item.score}</span>
                    </li>
                </div>
            ))}
        </div>
    );
}

export default Scorebelow70;
