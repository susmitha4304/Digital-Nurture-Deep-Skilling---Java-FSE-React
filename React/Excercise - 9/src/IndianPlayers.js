import React from "react";

export function OddPlayers([first, , third, , fifth]) {
    return (
        <div>
            <li>First : {first}</li>
            <li>Third : {third}</li>
            <li>Fifth : {fifth}</li>
        </div>
    );
}

export function EvenPlayers([, second, , fourth, , sixth]) {
    return (
        <div>
            <li>Second : {second}</li>
            <li>Fourth : {fourth}</li>
            <li>Sixth : {sixth}</li>
        </div>
    );
}

function ListofIndianPlayers(props) {
    return (
        <div>
            {props.IndianPlayers.map((player, index) => (
                <div key={index}>
                    <li>Mr. {player}</li>
                </div>
            ))}
        </div>
    );
}

export default ListofIndianPlayers;
