package com.vexsoftware.votifier.model;

import net.canarymod.hook.Hook;

/**
 * {@code VotifierEvent} is a custom CanaryMod hook class that is sent
 * synchronously to CanaryMod's main thread allowing other plugins to listener
 * for votes.
 *
 * @author Jason Jones (darkdiplomat)
 * @author frelling
 * 
 */
public class VotifierHook extends Hook {

	/**
	 * Encapsulated vote record.
	 */
	private Vote vote;

	/**
	 * Constructs a vote event that encapsulated the given vote record.
	 * 
	 * @param vote
	 *            vote record
	 */
	public VotifierHook(final Vote vote) {
		this.vote = vote;
	}

	/**
	 * Return the encapsulated vote record.
	 * 
	 * @return vote record
	 */
	public Vote getVote() {
		return vote;
	}
}
